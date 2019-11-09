package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class OrderFactory {
    public static Orders getOrders(String customerId, String date){
        return new Orders.Builder(Igenerator.getSuffixFromClassName(OrderFactory.class))
                .buildCustomerId(customerId)
                .buildDate(date)
                .build();

    }
}
