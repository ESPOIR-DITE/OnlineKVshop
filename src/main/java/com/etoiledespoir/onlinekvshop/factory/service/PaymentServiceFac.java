package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.paymentService.PayService;

public class PaymentServiceFac {
    public static PayService getPayService(){
        return PayService.getPayService();
    }
}
