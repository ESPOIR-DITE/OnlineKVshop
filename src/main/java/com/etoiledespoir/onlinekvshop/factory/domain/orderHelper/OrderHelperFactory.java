package com.etoiledespoir.onlinekvshop.factory.domain.orderHelper;

import com.etoiledespoir.onlinekvshop.domain.generic_class.OrderHelper;

public class OrderHelperFactory {
    public static OrderHelper getOrderHelper(String orderId,String date,String itemName,double quanriry,double price,String orderStat){
        return new OrderHelper.Builder(orderId).buildDate(date).buildItemNumber(itemName).buildOderStat(orderStat).buildPrice(price).buildQuantity(quanriry).build();
    }
}
