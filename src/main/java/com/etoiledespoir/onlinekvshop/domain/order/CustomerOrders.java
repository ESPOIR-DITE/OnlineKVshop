package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerOrders {
    @Id
    private String orderNumber;
    private String custId;
    private String date;

    private CustomerOrders() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomer() {
        return custId;
    }

    public void setCustomer(String customer_id) {
        this.custId = customer_id;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", customerid='" + custId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    /**
     * builder start here
     */
    public static class Builder {
        private String orderNumber;
        private String customer_id;
        private String date;

        public Builder(String orderNumber) {
            this.orderNumber = orderNumber;
        }

        public Builder buildDate(String date) {
            this.date = date;
            return this;
        }

        public Builder buildCustomer(String customer_id) {
            this.customer_id = customer_id;
            return this;
        }

        public CustomerOrders build() {
            CustomerOrders o= new CustomerOrders();
            o.date = this.date;
            o.orderNumber = this.orderNumber;
            o.custId =this.customer_id;
            return o;
        }
    }
}
