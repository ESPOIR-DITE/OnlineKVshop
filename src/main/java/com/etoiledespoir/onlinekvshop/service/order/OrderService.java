package com.etoiledespoir.onlinekvshop.service.order;

import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import com.etoiledespoir.onlinekvshop.repository.order.OrderRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements Iservice<Orders,String> {
    private static OrderService order=null;
    @Autowired
    private OrderRepository orderRepository;

    private  OrderService() {
    }
    public static OrderService getOrder(){
        if(order==null){
            order=new OrderService();
        }return order;
    }

    @Override
    public Orders creat(Orders order) {
        return orderRepository.save(order);
    }

    @Override
    public Orders delete(String id) {
        Optional<Orders> myOrder= orderRepository.findById(id);
        if(myOrder!=null){
            orderRepository.deleteById(id);
        }
        return myOrder.orElse(null);
    }

    @Override
    public Orders Update(Orders order) {
        return orderRepository.save(order);
    }

    @Override
    public Orders read(String id) {
        Optional<Orders> myOrder= orderRepository.findById(id);
        return myOrder.orElse(null);
    }

    @Override
    public List<Orders> readAll() {
        return orderRepository.findAll();
    }
    public List<Orders> readWithCust(String custId){
        List<Orders> result=new ArrayList<>();
        for(Orders orders:readAll()){
            if(orders.getCustomerId().equals(custId)){
                result.add(orders);
            }
        }return result;
    }


}
