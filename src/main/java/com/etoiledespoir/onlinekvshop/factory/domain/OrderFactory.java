package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.order.CustomerOrders;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class OrderFactory {
    public static CustomerOrders getOrders(String customerId, String date){
        return new CustomerOrders.Builder(Igenerator.getSuffixFromClassName(OrderFactory.class))
                .buildCustomer(customerId)
                .buildDate(date)
                .build();

    }
}
