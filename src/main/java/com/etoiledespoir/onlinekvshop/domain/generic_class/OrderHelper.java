package com.etoiledespoir.onlinekvshop.domain.generic_class;

public class OrderHelper {
    private String orderId;
    private String date;
    private String itemName;
    private double quantity;
    private double price;
    private String orderStat;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderStat() {
        return orderStat;
    }

    public void setOrderStat(String orderStat) {
        this.orderStat = orderStat;
    }

    @Override
    public String toString() {
        return "OrderHelper{" +
                "orderId='" + orderId + '\'' +
                ", date='" + date + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", orderStat='" + orderStat + '\'' +
                '}';
    }
    public static class Builder{
        private String orderId;
        private String date;
        private String itemName;
        private double quanriry;
        private double price;
        private String orderStat;

        public Builder(String orderId){
            this.orderId=orderId;
        }
        public Builder buildDate(String date){
            this.date=date;
            return this;
        }
        public Builder buildItemNumber(String itemName){
            this.itemName=itemName;
            return this;
        }
        public Builder buildQuantity(double quanriry){
            this.quanriry=quanriry;
            return this;
        }
        public Builder buildPrice(double price){
            this.price=price;
            return this;
        }
        public Builder buildOderStat(String orderStat){
            this.orderStat=orderStat;
            return this;
        }
        public OrderHelper build(){
            OrderHelper orderHelper=new OrderHelper();
            orderHelper.date=this.date;
            orderHelper.itemName=this.itemName;
            orderHelper.orderId=this.orderId;
            orderHelper.orderStat=this.orderStat;
            orderHelper.price=this.price;
            orderHelper.quantity =this.quanriry;
            return orderHelper;
        }
    }
}
