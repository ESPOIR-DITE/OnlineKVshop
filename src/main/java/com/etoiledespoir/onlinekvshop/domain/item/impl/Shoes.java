package com.etoiledespoir.onlinekvshop.domain.item.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shoes  {
    @Id
    private String ItemNumber;
    private String marque;
    private String itemType;
    private String size;
    private String gender;
    //@Column(name = "shoes_description" )
    private String decription;
    private String color;

    private Shoes() {
    }

    public String getColor() {
        return color;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setColor(String color) {
        this.color = color;
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
                ", ItemNumber='" + ItemNumber + '\'' +
                ", marque='" + marque + '\'' +
                ", itemType='" + itemType + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", decription='" + decription + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder{
        private String ItemNumber;
        private String marque;
        private String size;
        private String gender;
        private String decription;
        private String itemType;
        private String color;
        public Builder(String itemNumber){
            this.ItemNumber=itemNumber;
        }
        public Builder buildMarque(String marque){
            this.marque=marque;
            return this;
        }
        public Builder buildColor(String color){
            this.color=color;
            return this;
        }
        public Builder buildItemType(String itemType){
            this.itemType=itemType;
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
            s.color=this.color;
            s.itemType=this.itemType;
            return s;
        }
    }
}
