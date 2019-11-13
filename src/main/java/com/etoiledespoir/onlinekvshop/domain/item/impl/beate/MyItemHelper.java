package com.etoiledespoir.onlinekvshop.domain.item.impl.beate;

import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.domain.size.Size;

import java.util.ArrayList;

public class MyItemHelper {
    private String itemName;
    private ArrayList<String> size;
    private String decription;
    private ArrayList<String> gender;
    private String itemType;
    private int quantity;
    private double price;
    private ArrayList<byte[]> image;
    private ArrayList<String> colors;
    private String braind;

    private MyItemHelper() {
    }

    public String getBraind() {
        return braind;
    }

    public void setBraind(String braind) {
        this.braind = braind;
    }

    public ArrayList<String> getGender() {
        return gender;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public void setGender(ArrayList<String> gender) {
        this.gender = gender;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ArrayList<String> getSize() {
        return size;
    }

    public void setSize(ArrayList<String> size) {
        this.size = size;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }


    public ArrayList<byte[]> getImage() {
        return image;
    }

    public void setImage(ArrayList<byte[]> image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "MyItemHelper{" +
                "itemName='" + itemName + '\'' +
                ", size='" + size + '\'' +
                ", decription='" + decription + '\'' +
                ", gender='" + gender + '\'' +
                ", itemType='" + itemType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", image=" + image +
                ", colors=" + colors +
                ", braind='" + braind + '\'' +
                '}';
    }
}
