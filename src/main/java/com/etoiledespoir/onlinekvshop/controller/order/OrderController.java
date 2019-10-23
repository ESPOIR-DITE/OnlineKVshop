package com.etoiledespoir.onlinekvshop.controller.order;


import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import com.etoiledespoir.onlinekvshop.service.orderService.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/order")
public class OrderController implements Icontroller<Orders,String> {
    @Autowired
    private OrderService order;

    @PostMapping("/creat")
    public Orders create(@RequestBody Orders order){
        return this.order.creat(order);
    }
    @GetMapping("/read")
    @Override
    public Orders read(@RequestParam(value = "id") String id) {
        return order.read(id);
    }
    @PostMapping("/update")
    @Override
    public Orders update(@RequestBody Orders order) {
        return null;
    }
    @GetMapping("/delete")
    @Override
    public Orders delete(@RequestParam(value = "id")  String id) {
        return null;
    }
    @GetMapping("/reads")
    @Override
    public List<Orders> readAll() {
        return order.readAll();
    }

}
