package com.etoiledespoir.onlinekvshop.factory.domain.accounting.payment;

import com.etoiledespoir.onlinekvshop.domain.accounting.payment.Payment;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class PaymentFactory {
    public static Payment getPayment(String paymentType,double amount, int customer){
        return new Payment.Builder(Igenerator.getSuffixFromClassName(PaymentFactory.class))
                .buildAmount(amount)
                .builderOrderNumber(customer)
                .buildPaymentType(paymentType)
                .build();
    }
    public static Payment updatePayment(String paymentNUmber,String paymentType,double amount, int customer){
        return new Payment.Builder(paymentNUmber)
                .buildAmount(amount)
                .builderOrderNumber(customer)
                .buildPaymentType(paymentType)
                .build();
    }
}
