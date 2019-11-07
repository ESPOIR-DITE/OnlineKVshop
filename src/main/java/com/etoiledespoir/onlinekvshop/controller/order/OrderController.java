package com.etoiledespoir.onlinekvshop.controller.order;


import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.CustomerOrders;
import com.etoiledespoir.onlinekvshop.factory.domain.OrderFactory;
import com.etoiledespoir.onlinekvshop.service.orderService.impl.OrderService;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/order")
public class OrderController implements Icontroller<CustomerOrders,String> {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public CustomerOrders create(@RequestBody CustomerOrders customerOrders1){
        System.out.println(customerOrders1.getCustomer());
        CustomerOrders customerOrders = OrderFactory.getOrders(customerOrders1.getCustomer(), CurrentDate.getCurrentTimeUsingDate());
        return orderService.creat(customerOrders);
    }
    @GetMapping("/read")
    @Override
    public CustomerOrders read(@RequestParam(value = "id") String id) {
        return orderService.read(id);
    }
    @PostMapping("/update")
    @Override
    public CustomerOrders update(@RequestBody CustomerOrders order) {
        return null;
    }
    @GetMapping("/delete")
    @Override
    public CustomerOrders delete(@RequestParam(value = "id")  String id) {
        return null;
    }
    @GetMapping("/reads")
    @Override
    public List<CustomerOrders> readAll() {
        return orderService.readAll();
    }

}
