package com.etoiledespoir.onlinekvshop.factory.repository;

import com.etoiledespoir.onlinekvshop.repository.PaymentRepo.PaymentRepository;

public class PaymentRepFactory {
public static PaymentRepository getPayRep(){
    return PaymentRepository.getPaym();
}
}
