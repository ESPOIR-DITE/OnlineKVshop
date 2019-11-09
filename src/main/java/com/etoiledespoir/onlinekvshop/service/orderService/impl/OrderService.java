package com.etoiledespoir.onlinekvshop.service.orderService.impl;

import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import com.etoiledespoir.onlinekvshop.repository.OrderRepo.Iorder;
import com.etoiledespoir.onlinekvshop.service.orderService.IorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements IorderService {
    private static OrderService order=null;
    @Autowired
    private Iorder iorder;

    private  OrderService() {
    }
    public static OrderService getOrder(){
        if(order==null){
            order=new OrderService();
        }return order;
    }

    @Override
    public Orders creat(Orders order) {
        return iorder.save(order);
    }

    @Override
    public Orders delete(String id) {
        Optional<Orders> myOrder=iorder.findById(id);
        if(myOrder!=null){
            iorder.deleteById(id);
        }
        return myOrder.orElse(null);
    }

    @Override
    public Orders Update(Orders order) {
        return iorder.save(order);
    }

    @Override
    public Orders read(String id) {
        Optional<Orders> myOrder=iorder.findById(id);
        return myOrder.orElse(null);
    }

    @Override
    public List<Orders> readAll() {
        return iorder.findAll();
    }


}
