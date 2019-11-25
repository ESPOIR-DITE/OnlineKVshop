package com.etoiledespoir.onlinekvshop.service.orderline.impl;

import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import com.etoiledespoir.onlinekvshop.repository.orderline.OrderLineRep;
import com.etoiledespoir.onlinekvshop.service.orderline.OrderLineServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class OrderLineService implements OrderLineServiceInt {
    @Autowired
    OrderLineRep orderLineRep;
    private static OrderLineService orderLineService;

    private OrderLineService() {
    }

    public static OrderLineService getOrderLineService(){
        if(orderLineService==null){
            orderLineService=new OrderLineService();
        }return orderLineService;
    }

    @Override
    public OrderLine creat(OrderLine orderLine) {
        return orderLineRep.save(orderLine);
    }

    @Override
    public OrderLine delete(String id) {
        Optional<OrderLine> result=orderLineRep.findById(id);
        orderLineRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public OrderLine Update(OrderLine orderLine) {
        return orderLineRep.save(orderLine);
    }

    @Override
    public OrderLine read(String id) {
        Optional<OrderLine> result=orderLineRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<OrderLine> readAll() {
        return orderLineRep.findAll();
    }

    public List<OrderLine> readWithOrderId(String orderId){
        List<OrderLine> orderLines=new ArrayList<>();
        for(OrderLine orderLine: readAll()){
            if(orderLine.getOrderNumber().equals(orderId)){
                orderLines.add(orderLine);
            }
        }
        return orderLines;
    }
    public List<OrderLine> readWithItemId(String itemId){
        List<OrderLine> orderLines=new ArrayList<>();
        for(OrderLine orderLine: readAll()){
            if(orderLine.getOrderNumber().equals(itemId)){
                orderLines.add(orderLine);
            }
        }
        return orderLines;
    }
    public OrderLine readWithOrderNumber(String orderId){

        for(OrderLine orderLine: readAll()){
            if(orderLine.getOrderNumber().equals(orderId)){
                return orderLine;
            }
        }
        return null;
    }
}
