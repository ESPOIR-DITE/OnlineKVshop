package com.etoiledespoir.onlinekvshop.domain.payment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment  {
    @Id
    private String paymentNUmber;
    private String PaymentType;
    private double amount;
    private int orderNumber;

    private Payment(){}

    public String getPaymentNUmber() {
        return paymentNUmber;
    }

    public void setPaymentNUmber(String paymentNUmber) {
        this.paymentNUmber = paymentNUmber;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomer() {
        return orderNumber;
    }

    public void setCustomer(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentNUmber='" + paymentNUmber + '\'' +
                ", PaymentType='" + PaymentType + '\'' +
                ", amount=" + amount +
                ", customer=" + orderNumber +
                '}';
    }

    /**
     * Start Builder
     */

    public static class Builder{
        private String paymentNUmber;
        private String paymentType;
        private double amount;
        private int orderNumber;
        public Builder(String paymentNUmber){
           this.paymentNUmber=paymentNUmber;
        }
        public Builder buildPaymentType(String paymentType){
            this.paymentType=paymentType;
            return this;
        }
        public Builder buildAmount(double amount){
            this.amount=amount;
            return this;
        }
        public Builder builderOrderNumber(int orderNumber)
        {
            this.orderNumber=orderNumber;
            return this;
        }
        public Payment build()
        {
            Payment payment=new Payment();
            payment.amount=this.amount;
            payment.orderNumber=this.orderNumber;
            payment.paymentNUmber=this.paymentNUmber;
            payment.PaymentType=this.paymentType;
            return payment;
        }

    }//end builder
}
