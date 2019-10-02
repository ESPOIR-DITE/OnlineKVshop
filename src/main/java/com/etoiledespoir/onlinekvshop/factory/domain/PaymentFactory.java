package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.payment.Payment;

public class PaymentFactory {
    public static Payment getPayment(String paymentNUmber,String paymentType,double amount, int customer){
        return new Payment.Builder(paymentNUmber)
                .buildAmount(amount)
                .builderCustomer(customer)
                .buildPaymentType(paymentType)
                .build();
    }
}
