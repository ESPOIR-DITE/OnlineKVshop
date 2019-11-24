package com.etoiledespoir.onlinekvshop.domain.joins;

import java.util.Arrays;

/**
 * this class will provide an object that contains an aggregated data for item verifficatiobn
 */
public class ItemView {
    private String itemNumber;
    private String productName;
    private double price;
    private String description;
    private byte[] image;

    public ItemView() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ItemView{" +
                "itemNumber='" + itemNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public static class Builder{
        private String itemNumber;
        private String productName;
        private double price;
        private String description;
        private byte[] image;

        public Builder(String itemNumber){
            this.itemNumber=itemNumber;
        }
        public Builder buildProductName(String productName){
            this.productName=productName;
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
        public Builder buildImage(byte[] image){
            this.image=image;
            return this;
        }
        public ItemView build(){
            ItemView itemCheck=new ItemView();
            itemCheck.description=this.description;
            itemCheck.image=this.image;
            itemCheck.price=this.price;
            itemCheck.itemNumber=this.itemNumber;
            itemCheck.productName=this.productName;
            return itemCheck;
        }
    }
}
