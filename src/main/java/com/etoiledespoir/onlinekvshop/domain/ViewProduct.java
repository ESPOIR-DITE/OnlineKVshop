package com.etoiledespoir.onlinekvshop.domain;

import com.etoiledespoir.onlinekvshop.domain.color.Color;

import java.util.ArrayList;

public class ViewProduct {
    private String itemId;
    private String itemName;
    private String itemBrand;
    private double price;
    private String description;
    private int quantity;
    private ArrayList<byte[]> pictures;
    private ArrayList<Color>colors;

    private ViewProduct() {
    }

    public String getItemId() {
        return itemId;
    }

    public ArrayList<byte[]> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<byte[]> pictures) {
        this.pictures = pictures;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }

    public void setColors(ArrayList<Color> colors) {
        this.colors = colors;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ViewProduct{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemBrand='" + itemBrand + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
    public static class Builder{
        private String itemId;
        private String itemName;
        private String itemBrand;
        private double price;
        private String description;
        private int quantity;
        private ArrayList<byte[]> pictures;
        private ArrayList<Color>colors;

        public Builder(String itemId){
            this.itemId=itemId;
        }
        public Builder buildPictures(ArrayList<byte[]> pictures){
            this.pictures=pictures;
            return this;
        }
        public Builder buildColors(ArrayList<Color> colors){
            this.colors=colors;
            return this;
        }
        public Builder buildItemName(String itemName){
            this.itemName=itemName;
            return this;
        }
        public Builder buildItemBrand(String itemBrand){
            this.itemBrand=itemBrand;
            return this;
        }
        public Builder buildPrice(double price){
            this.price=price;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public ViewProduct build(){
            ViewProduct viewProduct=new ViewProduct();
            viewProduct.description=this.description;
            viewProduct.itemBrand=this.itemBrand;
            viewProduct.itemId=this.itemId;
            viewProduct.itemName=this.itemName;
            viewProduct.price=this.price;
            viewProduct.quantity=this.quantity;
            viewProduct.colors=this.colors;
            viewProduct.pictures=this.pictures;
            return viewProduct;
        }
    }
}
