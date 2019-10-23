package com.etoiledespoir.onlinekvshop.domain.item.impl.cloths;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cloths {

    @Id
    private String itemNumber;
    private String itemName;
    private String itemType;
    private String size;
    private String marque;
    private String gender;
    private String decription;
    private String color;

    private Cloths() {
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }


    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cloths{" +
                ", itemNumber='" + itemNumber + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemType='" + itemType + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", decription='" + decription + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public static class Builder{
        private String itemNumber;
        private String itemName;
        private String itemType;
        private String size;
        private String marque;
        private String gender;
        private String decription;
        private String color;

        public Builder(String itemNumber){
            this.itemNumber=itemNumber;
        }
        public Builder buildName(String name){
            this.itemName=name;
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
        public Builder buildColor(String color){
            this.color=color;
            return this;
        }
        public Builder buildGender(String gender){
            this.gender=gender;
            return this;
        }
        public Builder buildItemType(String itemType){
            this.itemType=itemType;
            return this;
        }
        public Builder buildDescription(String decription){
            this.decription=decription;
            return this;
        }
        public Cloths build(){
            Cloths b=new Cloths();
            b.decription=this.decription;
            b.itemName=this.itemName;
            b.itemNumber=this.itemNumber;
            b.marque=this.marque;
            b.size=this.size;
            b.color=this.color;
            b.gender=this.gender;
            b.itemType=this.itemType;
            return b;
        }

    }
}
