package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.accounting.PaymentService;

public class PaymentServiceFac {
    public static PaymentService getPayService(){
        return PaymentService.getPaymentService();
    }
}
