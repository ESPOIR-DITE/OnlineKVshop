package com.etoiledespoir.onlinekvshop.controller.order;


import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import com.etoiledespoir.onlinekvshop.factory.domain.OrderFactory;
import com.etoiledespoir.onlinekvshop.service.orderService.impl.OrderService;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/order")
public class OrderController  {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Orders create(@RequestBody Orders orders){
        System.out.println(orders.toString());
        /**
         * remember the getDate should return the customer id.
         */
        Orders orders1 = OrderFactory.getOrders(orders.getCustomerId(), CurrentDate.getCurrentTimeUsingDate());
        return orderService.creat(orders1);
    }
    @GetMapping("/read")
    public Orders read(@RequestParam(value = "id") String id) {
        return orderService.read(id);
    }
    @PostMapping("/update")

    public Orders update(@RequestBody Orders order) {
        System.out.println(order.toString());
        return orderService.Update(order);
    }
    @GetMapping("/delete")

    public Orders delete(@RequestParam(value = "id")  String id) {
        return orderService.delete(id);
    }
    @GetMapping("/reads")

    public List<Orders> readAll() {
        return orderService.readAll();
    }

}
