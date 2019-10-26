package com.etoiledespoir.onlinekvshop.domain.item.impl.cloths;

import java.util.Arrays;

public class ClothsHelper {
    private String itemName;
    private String size;
    private String decription;
    private String color;
    private byte[] image;
    private String type;
    private String gender;
    private String material;
    private String braind;
    private double price;
    private int quantity;

    public ClothsHelper() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBraind() {
        return braind;
    }

    public void setBraind(String braind) {
        this.braind = braind;
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
        return "ClothsHelper{" +
                "itemName='" + itemName + '\'' +
                ", size='" + size + '\'' +
                ", decription='" + decription + '\'' +
                ", color='" + color + '\'' +
                ", image=" + Arrays.toString(image) +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", material='" + material + '\'' +
                ", braind='" + braind + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
