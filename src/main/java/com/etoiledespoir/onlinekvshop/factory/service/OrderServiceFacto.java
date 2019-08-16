package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.orderService.OrderService;

public class OrderServiceFacto {
    public static OrderService getOrderServis(){
        return OrderService.getOrder();
    }
}
