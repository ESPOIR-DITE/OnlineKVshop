package com.etoiledespoir.onlinekvshop.domain.accounting;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounting {
    @Id
    private String itemId;
    private double price;
    private int quantity;

    public Accounting() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "itemId='" + itemId + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    public static class Builder{
        private String itemId;
        private double price;
        private int quantity;
        public Builder(String itemId){
            this.itemId=itemId;
        }
        public Builder buildPrice(double price){
            this.price=price;
            return this;
        }
        public Builder buildQuality(int quantity){
            this.quantity =quantity;
            return this;
        }
        public Accounting build(){
            Accounting accounting=new Accounting();
            accounting.quantity=this.quantity;
            accounting.price=this.price;
            accounting.itemId=this.itemId;
            return accounting;
        }
    }
}
