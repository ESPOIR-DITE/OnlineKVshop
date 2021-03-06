package com.etoiledespoir.onlinekvshop.factory.domain.order.orderHelper;

import com.etoiledespoir.onlinekvshop.domain.OrderHelper;

public class OrderHelperFactory {
    public static OrderHelper getOrderHelper(String orderId,String date,String itemName,double quanriry,double price,String orderStat){
        return new OrderHelper.Builder(orderId).buildDate(date).buildItemNumber(itemName).buildOderStat(orderStat).buildPrice(price).buildQuantity(quanriry).build();
    }
}
