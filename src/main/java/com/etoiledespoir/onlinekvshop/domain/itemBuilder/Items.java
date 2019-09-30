package com.etoiledespoir.onlinekvshop.domain.itemBuilder;

import java.awt.*;

public class Items {
    private String ItemNumber;
    private String name;
    private String type;
    private String size;
    private String gender;
    private String decription;
    private Image image;
    private double price;
    private int quantity;

    public String getItemNumber() {
        return ItemNumber;
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

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Items{" +
                "ItemNumber='" + ItemNumber + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", decription='" + decription + '\'' +
                ", image=" + image +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
