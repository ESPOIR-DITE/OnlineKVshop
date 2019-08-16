package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Customer;
import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.domain.ItemSold;
import com.etoiledespoir.onlinekvshop.domain.Order;

import java.util.ArrayList;
import java.util.Date;

public class OrderFactory {
    public static Order buildOrder(String orderNumber, int customer, ArrayList<ItemSold>items, String date){
        return new Order.Builder(orderNumber)
                .buildCustomer(customer)
                .buildItem(items)
                .buildDate(date)
                .build();

    }
}
