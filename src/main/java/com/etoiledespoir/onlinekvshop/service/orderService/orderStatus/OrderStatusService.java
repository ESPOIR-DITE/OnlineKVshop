package com.etoiledespoir.onlinekvshop.service.orderService.orderStatus;

import com.etoiledespoir.onlinekvshop.domain.order.OrderStatus;
import com.etoiledespoir.onlinekvshop.repository.OrderRepo.OrderStatusRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderStatusService implements Iservice<OrderStatus,String> {
    @Autowired
    OrderStatusRep orderStatusRep;
    @Override
    public OrderStatus creat(OrderStatus orderStatus) {
        return orderStatusRep.save(orderStatus);
    }

    @Override
    public OrderStatus delete(String id) {
        Optional<OrderStatus> result=orderStatusRep.findById(id);
        orderStatusRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public OrderStatus Update(OrderStatus orderStatus) {
        return orderStatusRep.save(orderStatus);
    }

    @Override
    public OrderStatus read(String id) {
        Optional<OrderStatus> result=orderStatusRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<OrderStatus> readAll() {
        return orderStatusRep.findAll();
    }
    public OrderStatus readWithOrderId(String orderId){
        for(OrderStatus orderStatus:readAll()){
            if(orderStatus.getOrderId().equals(orderId)){
                return orderStatus;
            }
        }return null;
    }
}
