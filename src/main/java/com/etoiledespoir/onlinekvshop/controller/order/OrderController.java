package com.etoiledespoir.onlinekvshop.controller.order;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.Order;
import com.etoiledespoir.onlinekvshop.service.orderService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/OKVS/order")
public class OrderController implements Icontroller<Order,String> {
    @Autowired
    private OrderService order;

    @RequestMapping("/creat")
    public Order create(@RequestBody Order order){
        return this.order.creat(order);
    }
    @GetMapping("/read")
    @Override
    public Order read(@RequestParam(value = "id") String id) {
        return order.read(id);
    }
    @PostMapping("/update")
    @Override
    public Order update(@RequestBody Order order) {
        return null;
    }
    @GetMapping("/delete")
    @Override
    public Order delete(@RequestParam(value = "id")  String id) {
        return null;
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<String> readAll() {
        return order.readAll();
    }

}
