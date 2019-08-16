package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.OrderLine;

public class OrderLineFactory {
    public static OrderLine getLine(String linecode,String itemNumber,String OrderNumber,String date){
        return new OrderLine.Builder(linecode)
                .buildDate(date)
                .buildOrderNumb(OrderNumber)
                .buildItemNumber(itemNumber)
                .getOrderLine();

    }
}
