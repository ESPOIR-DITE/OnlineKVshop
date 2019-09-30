package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.ItemSold;
import com.etoiledespoir.onlinekvshop.domain.order.Order;

import java.util.ArrayList;

public class OrderFactory {
    public static Order buildOrder(String orderNumber, int customer, ArrayList<ItemSold>items, String date){
        return new Order.Builder(orderNumber)
                .buildCustomer(customer)
                .buildItem(items)
                .buildDate(date)
                .build();

    }
}
