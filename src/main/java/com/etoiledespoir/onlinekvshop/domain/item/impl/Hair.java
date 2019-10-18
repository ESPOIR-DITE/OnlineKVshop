package com.etoiledespoir.onlinekvshop.domain.item.impl;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Hair {
    @Id
    private String ItemNumber;
    private String Itemname;
    private String itemType;
    private String size;
    private String gender;
    @Column(name = "hair_description" )
    private String decription;
    private String color;

    private Hair() {
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getItemname() {
        return Itemname;
    }

    public void setItemname(String itemname) {
        Itemname = itemname;
    }

    public String getType() {
        return itemType;
    }

    public void setType(String type) {
        this.itemType = type;
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
    public static class Builder{
        private String ItemNumber;
        private String Itemname;
        private String type;
        private String size;
        private String gender;
        private String decription;
        private String color;

        public Builder(String itemNumber){
            this.ItemNumber=itemNumber;
        }
        public Builder buildName(String name){
            this.Itemname=name;
            return this;
        }
        public Builder buildType(String type){
            this.type=type;
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
        public Builder buildDescription(String decription){
            this.decription=decription;
            return this;
        }

    public Hair build(){
        Hair h=new Hair();
        h.color=this.color;
        h.decription=this.decription;
        h.gender=this.gender;
        h.Itemname=this.Itemname;
        h.ItemNumber=this.ItemNumber;
        h.size=this.size;
        h.itemType=this.type;
        return h;
    }}
}
