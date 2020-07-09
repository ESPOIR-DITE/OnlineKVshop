package com.etoiledespoir.onlinekvshop.domain.generic;

public class ItemGeneric {
    private double price;
    private int quantity;
    private String description;
    private String ItemName;
    private String marque;
    private String itemType;
    private String size;
    private String color;
    private String gender;

    private ItemGeneric() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ItemGeneric{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", marque='" + marque + '\'' +
                ", itemType='" + itemType + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public static class Builder{
        private double price;
        private int quantity;
        private String description;
        private String ItemName;
        private String marque;
        private String itemType;
        private String size;
        private String color;
        private String gender;

        public Builder(double price){
            this.price=price;
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
            this.description=decription;
            return this;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public ItemGeneric build(){
            ItemGeneric i=new ItemGeneric();
            i.color=this.color;
            i.description=this.description;
            i.gender=this.gender;
            i.ItemName=this.ItemName;
            i.itemType=this.itemType;
            i.marque=this.marque;
            i.price=this.price;
            i.size=this.size;
            return i;
        }
    }
}
