package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class OrderLineFactory {
    public static OrderLine getLine(String itemNumber,String OrderNumber){
        return new OrderLine.Builder(Igenerator.getSuffixFromClassName(OrderLineFactory.class))
                .buildOrderNumb(OrderNumber)
                .buildItemNumber(itemNumber)
                .getOrderLine();

    }
}
