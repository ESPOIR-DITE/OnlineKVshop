package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class OrderStatus {
    @Id
    private String id;
    private String OrderId;
    private Date date;
    private String modifiedBy;
    private String stat;

    private OrderStatus() {
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
                ", date=" + date +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", stat='" + stat + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String OrderId;
        private Date date;
        private String stat;
        private String modifiedBy;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildOderId(String orderId){
            this.OrderId=orderId;
            return this;
        }
        public Builder buildModifier(String modifiedBy){
            this.modifiedBy=modifiedBy;
            return this;
        }
        public Builder buildDate(Date date){
            this.date=date;
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
            orderStatus.date=this.date;
            orderStatus.modifiedBy=this.modifiedBy;
            return orderStatus;
        }
    }
}
