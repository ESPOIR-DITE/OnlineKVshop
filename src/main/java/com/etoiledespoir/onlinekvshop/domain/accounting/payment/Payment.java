package com.etoiledespoir.onlinekvshop.domain.accounting.payment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment  {
    @Id
    private String paymentNumber;
    private String PaymentTypeId;
    private double amount;
    private int orderNumber;

    private Payment(){}

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public String getPaymentTypeId() {
        return PaymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        PaymentTypeId = paymentTypeId;
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
                "paymentNumber='" + paymentNumber + '\'' +
                ", PaymentTypeId='" + PaymentTypeId + '\'' +
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
            payment.paymentNumber =this.paymentNUmber;
            payment.PaymentTypeId =this.paymentType;
            return payment;
        }

    }//end builder
}
