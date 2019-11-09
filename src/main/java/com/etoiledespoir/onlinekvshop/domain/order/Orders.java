package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
    @Id
    private String id;
    private String customerId;
    private String date;

    private Orders() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String customerId;
        private String date;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildCustomerId(String customerId){
            this.customerId=customerId;
            return this;
        }
        public Builder buildDate(String date){
            this.date=date;
            return this;
        }
        public Orders build(){
            Orders orders=new Orders();
            orders.customerId=this.customerId;
            orders.date=this.date;
            orders.id=this.id;
            return orders;
        }
    }
}
