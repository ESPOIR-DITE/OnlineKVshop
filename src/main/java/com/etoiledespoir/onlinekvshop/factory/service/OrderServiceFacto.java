package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.orderService.impl.OrderService;

public class OrderServiceFacto {
    public static OrderService getOrderServis(){
        return OrderService.getOrder();
    }
}
