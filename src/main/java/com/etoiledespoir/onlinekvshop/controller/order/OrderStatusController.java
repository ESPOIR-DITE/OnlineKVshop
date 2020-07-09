package com.etoiledespoir.onlinekvshop.controller.order;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.OrderStatus;
import com.etoiledespoir.onlinekvshop.factory.domain.order.OrderStatusFactory;
import com.etoiledespoir.onlinekvshop.service.order.status.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/OKVS/orderstatus/")
public class OrderStatusController implements Icontroller<OrderStatus,String> {
    @Autowired
    OrderStatusService orderStatusService;
    @PostMapping("create")
    @Override
    public OrderStatus create(@RequestBody OrderStatus orderStatus) {
        OrderStatus orderStatus1= OrderStatusFactory.getOrderstatus(orderStatus.getOrderId(),orderStatus.getStat(),orderStatus.getDate(),orderStatus.getModifiedBy());
        return orderStatusService.creat(orderStatus1);
    }

    @GetMapping("read")
    @Override
    public OrderStatus read(@RequestParam("id") String id) {
        return orderStatusService.read(id);
    }

    @PostMapping("update")
    @Override
    public OrderStatus update(@RequestBody OrderStatus orderStatus) {
        return orderStatusService.Update(orderStatus);
    }

    @GetMapping("delete")
    @Override
    public OrderStatus delete(@RequestParam("id") String id) {
        return null;
    }
    @GetMapping("readWithOrderId")
    public OrderStatus readWithOrderId(@RequestParam("id") String id){
        return orderStatusService.readWithOrderId(id);
    }

    @GetMapping("reads")
    @Override
    public List<OrderStatus> readAll() {
        return orderStatusService.readAll();
    }

    @GetMapping("readFor")
    public List<OrderStatus> readAllFor(@RequestParam("orderId") String orderId){
        return orderStatusService.readAllOf(orderId);
    }
}
