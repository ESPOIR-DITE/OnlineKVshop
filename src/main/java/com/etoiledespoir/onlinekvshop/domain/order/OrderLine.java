package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderLine {
    @Id
    private String linecode;
    private String itemNumber;
    private String orderNumber;
    private double quantity;



    private OrderLine() {
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
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
                ", quantity=" + quantity +
                '}';
    }

    public static  class Builder{
        private String linecode;
        private String itemNumber;
        private String OrderNumber;
        private int quantity;

        public Builder (String linecode){
            this.linecode=linecode;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
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
            line.quantity=this.quantity;
            return line;
        }

    }
}
