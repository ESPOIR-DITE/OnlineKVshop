package com.etoiledespoir.onlinekvshop.controller.order.orderLine;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import com.etoiledespoir.onlinekvshop.factory.domain.order.OrderLineFactory;
import com.etoiledespoir.onlinekvshop.service.order.orderline.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/OKVS/orderline")
public class OrderlinController implements Icontroller<OrderLine,String> {

    @Autowired
    OrderLineService orderLineService;
    @PostMapping("/create")
    @Override
    public OrderLine create(@RequestBody OrderLine orderLine) {
        System.out.println(orderLine.toString());
    OrderLine orderLine1= OrderLineFactory.getLine(orderLine.getItemNumber(),orderLine.getOrderNumber(),11);
        return orderLineService.creat(orderLine1);
    }

    @GetMapping("/read")
    @Override
    public OrderLine read(@RequestParam("id") String id) {
        return orderLineService.read(id);
    }

    @PostMapping("/update")
    @Override
    public OrderLine update(@RequestBody OrderLine orderLine) {
        return orderLineService.Update(orderLine);
    }

    @GetMapping("/delete")
    @Override
    public OrderLine delete(@RequestParam("id") String id) {
        return orderLineService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<OrderLine> readAll() {
        System.out.println("we are in");
        return orderLineService.readAll();
    }
    @GetMapping("/readWithItemId")
    public List<OrderLine> readWithItemId(@RequestParam("id") String itemId){
        return orderLineService.readWithItemId(itemId);
    }
    @GetMapping("/readWithOrderId")
    public List<OrderLine> readWithOrderId(@RequestParam("id") String orderId){
        return orderLineService.readWithOrderId(orderId);
    }
}
