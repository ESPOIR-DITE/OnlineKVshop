package com.etoiledespoir.onlinekvshop.controller.orderLine;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import com.etoiledespoir.onlinekvshop.service.orderline.impl.OrderLineService;
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
        return orderLineService.creat(orderLine);
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
        return orderLineService.readAll();
    }
}
