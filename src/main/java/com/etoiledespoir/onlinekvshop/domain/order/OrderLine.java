package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderLine {
    @Id
    private String linecode;
    private String itemNumber;
    private String orderNumber;



    private OrderLine() {
    }


    public String getLinecode() {
        return linecode;
    }

    public void setLinecode(String linecode) {
        this.linecode = linecode;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "linecode='" + linecode + '\'' +
                ", itemNumber='" + itemNumber + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                '}';
    }

    public static  class Builder{
        private String linecode;
        private String itemNumber;
        private String OrderNumber;
        public Builder (String linecode){
            this.linecode=linecode;
        }
        public Builder buildItemNumber(String itemNumber){
            this.itemNumber=itemNumber;
            return this;
        }
        public Builder buildOrderNumb(String orderNumber){
            this.OrderNumber=orderNumber;
            System.out.println(orderNumber);
            return this;
        }

        public OrderLine getOrderLine(){
            OrderLine line=new OrderLine();
            line.itemNumber=this.itemNumber;
            line.linecode=this.linecode;
            line.orderNumber =this.OrderNumber;
            return line;
        }

    }
}
