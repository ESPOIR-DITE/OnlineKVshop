package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.order.Orders;

public class OrderFactory {
    public static Orders buildOrder(String orderNumber, String customer_id, String date){
        return new Orders.Builder(orderNumber)
                .buildCustomer(customer_id)
                .buildDate(date)
                .build();

    }
}
