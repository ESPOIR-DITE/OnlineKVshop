package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderStatus {
    @Id
    private String id;
    private String OrderId;
    private String stat;

    private OrderStatus() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "id='" + id + '\'' +
                ", OrderId='" + OrderId + '\'' +
                ", stat='" + stat + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String OrderId;
        private String stat;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildOderId(String orderId){
            this.OrderId=orderId;
            return this;
        }
        public Builder buildStat(String stat){
            this.stat=stat;
            return this;
        }
        public OrderStatus build(){
            OrderStatus orderStatus=new OrderStatus();
            orderStatus.id=this.id;
            orderStatus.OrderId=this.OrderId;
            orderStatus.stat=this.stat;
            return orderStatus;
        }
    }
}
