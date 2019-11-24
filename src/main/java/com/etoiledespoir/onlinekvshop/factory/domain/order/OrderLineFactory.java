package com.etoiledespoir.onlinekvshop.factory.domain.order;

import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class OrderLineFactory {
    public static OrderLine getLine(String itemNumber,String OrderNumber,int quantity){
        return new OrderLine.Builder(Igenerator.getSuffixFromClassName(OrderLineFactory.class))
                .buildOrderNumb(OrderNumber)
                .buildItemNumber(itemNumber)
                .buildQuantity(quantity)
                .getOrderLine();

    }
}
