package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
    @Id
    private String orderNumber;
    private String customer_id;
    private String date;

    private Orders() {
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
        return customer_id;
    }

    public void setCustomer(String customer_id) {
        this.customer_id = customer_id;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", customer_id='" + customer_id + '\'' +
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

        public Orders build() {
            Orders order = new Orders();
            order.date = this.date;
            order.orderNumber = this.orderNumber;
            return order;
        }
    }
}
