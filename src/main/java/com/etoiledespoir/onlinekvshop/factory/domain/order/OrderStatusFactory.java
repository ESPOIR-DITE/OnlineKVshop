package com.etoiledespoir.onlinekvshop.factory.domain.order;

import com.etoiledespoir.onlinekvshop.domain.order.OrderStatus;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

import java.util.Date;

public class OrderStatusFactory {
    public static OrderStatus getOrderstatus(String OrderId, String stat, Date date,String modifier){
        return new OrderStatus.Builder(Igenerator.getSuffixFromClassName(OrderStatus.class))
                .buildOderId(OrderId)
                .buildStat(stat)
                .buildModifier(modifier)
                .buildDate(date)
                .build();
    }
}
