package com.etoiledespoir.onlinekvshop.factory.repository;

import com.etoiledespoir.onlinekvshop.repository.OrderRepo.OrderRepository;

public class OrderRepFactory {
    public static OrderRepository getOrder(){
        return OrderRepository.getOrd();
    }
}
