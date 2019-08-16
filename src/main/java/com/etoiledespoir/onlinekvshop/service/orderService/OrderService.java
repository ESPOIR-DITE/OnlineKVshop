package com.etoiledespoir.onlinekvshop.service.orderService;

import com.etoiledespoir.onlinekvshop.domain.Order;
import com.etoiledespoir.onlinekvshop.factory.repository.OrderRepFactory;
import com.etoiledespoir.onlinekvshop.repository.OrderRepo.Iorder;
import com.etoiledespoir.onlinekvshop.repository.OrderRepo.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService implements Iorder {
    private static OrderService order=null;
    private OrderRepository orderRep= OrderRepFactory.getOrder();

    private  OrderService() {
    }
    public static OrderService getOrder(){
        if(order==null){
            order=new OrderService();
        }return order;
    }

    @Override
    public Order creat(Order order) {
        return this.orderRep.creat(order);
    }

    @Override
    public Order delete(String id) {
        return this.orderRep.delete(id);
    }

    @Override
    public Order Update(Order order) {
        return orderRep.Update(order);
    }

    @Override
    public Order read(String id) {
        return orderRep.read(id);
    }

    @Override
    public ArrayList<String> readAll() {
        return orderRep.readAll();
    }

    @Override
    public String getPremier() {
        return null;
    }
}
