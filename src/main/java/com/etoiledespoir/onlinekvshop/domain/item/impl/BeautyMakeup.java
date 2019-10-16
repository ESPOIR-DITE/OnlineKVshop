package com.etoiledespoir.onlinekvshop.domain.item.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BeautyMakeup {
    @Id
    private String ItemNumber;
    private String ItemName;
    //private String marque;
    //private String itemType;
    private String size;
    @Column(name = "beaty_description" )
    private String decription;
    private String color;

    private BeautyMakeup() {
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
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

    @Override
    public String toString() {
        return "BeautyMakeup{" +
                "ItemNumber='" + ItemNumber + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", size='" + size + '\'' +
                ", decription='" + decription + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {
        private String ItemNumber;
        private String ItemName;
        private String size;
        private String decription;
        private String color;

        public Builder(String itemNumber) {
            this.ItemNumber = itemNumber;
        }

        public Builder buildName(String name) {
            this.ItemName = name;
            return this;
        }


        public Builder buildColor(String color) {
            this.color = color;
            return this;
        }



        public Builder buildSize(String size) {
            this.size = size;
            return this;
        }

        public Builder buildDescription(String decription) {
            this.decription = decription;
            return this;
        }

        public BeautyMakeup build() {
            BeautyMakeup b = new BeautyMakeup();
            b.decription = this.decription;
            b.ItemName = this.ItemName;
            b.ItemNumber = this.ItemNumber;
            b.color = this.color;
            b.size = this.size;
            return b;
        }

    }
}
