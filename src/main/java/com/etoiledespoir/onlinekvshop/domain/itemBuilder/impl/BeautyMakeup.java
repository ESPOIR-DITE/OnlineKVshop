package com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BeautyMakeup  {
    @Id
    private String ItemNumber;
    private String ItemName;
    private String marque;
    private String size;
    private String decription;
    private double price;
    private int quantity;

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getName() {
        return ItemName;
    }

    public void setName(String name) {
        this.ItemName = name;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
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
        return "BeautyMakeup{" +
                "ItemNumber='" + ItemNumber + '\'' +
                ", name='" + ItemName + '\'' +
                ", marque='" + marque + '\'' +
                ", size='" + size + '\'' +
                ", decription='" + decription + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    public static class Builder{
        private String ItemNumber;
        private String ItemName;
        private String marque;
        private String size;
        private String decription;
        private double price;
        private int quantity;

        public Builder(String itemNumber){
        this.ItemNumber=itemNumber;
        }
        public Builder buildName(String name){
            this.ItemName=name;
            return this;
        }
        public Builder buildMarque(String marque){
            this.marque=marque;
            return this;
        }
        public Builder buildSize(String size){
            this.size=size;
            return this;
        }
        public Builder buildDescription(String decription){
            this.decription=decription;
            return this;
        }
        public Builder buildPrice(double price){
            this.price=price;
            return this;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public BeautyMakeup build(){
            BeautyMakeup b=new BeautyMakeup();
            b.decription=this.decription;
            b.ItemName=this.ItemName;
            b.ItemNumber=this.ItemNumber;
            b.marque=this.marque;
            b.price=this.price;
            b.quantity=this.quantity;
            b.size=this.size;
            return b;
        }

    }
}
