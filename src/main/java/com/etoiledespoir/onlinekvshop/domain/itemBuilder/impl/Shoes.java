package com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.Items;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shoes  {
    private Items items;

    @Id
    private String ItemNumber;
    private String marque;
    private String size;
    private String gender;
    private String decription;
    /**private Image image;
    private double price;
    private int quantity;*/

    private Shoes() {
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "items=" + items +
                ", ItemNumber='" + ItemNumber + '\'' +
                ", marque='" + marque + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", decription='" + decription + '\'' +
                '}';
    }
    public static class Builder{
        private String ItemNumber;
        private String marque;
        private String size;
        private String gender;
        private String decription;
        public Builder(String itemNumber){
            this.ItemNumber=itemNumber;
        }
        public Builder buildMarque(String marque){
            this.marque=marque;
            return this;
        }
        public Builder buildSize(String size){
            this.size=size;
            return this;
        }
        public Builder buildGender(String gender){
            this.gender=gender;
            return this;
        }
        public Builder buildDescription(String decription){
            this.decription=decription;
            return this;
        }
        public Shoes build(){
            Shoes s=new Shoes();
            s.decription=this.decription;
            s.gender=this.gender;
            s.ItemNumber=this.ItemNumber;
            s.size=this.size;
            s.marque=this.marque;
            return s;
        }
    }
}
