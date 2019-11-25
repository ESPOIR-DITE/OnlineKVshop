package com.etoiledespoir.onlinekvshop.factory.domain.order;

import com.etoiledespoir.onlinekvshop.domain.order.OrderStatus;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class OrderStatusFactory {
    public static OrderStatus getOrderstatus(String OrderId,String stat){
        return new OrderStatus.Builder(Igenerator.getSuffixFromClassName(OrderStatus.class))
                .buildOderId(OrderId)
                .buildStat(stat)
                .build();
    }
}
