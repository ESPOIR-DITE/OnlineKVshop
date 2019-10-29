package com.etoiledespoir.onlinekvshop.domain.item.impl.beate;

import com.etoiledespoir.onlinekvshop.domain.color.Color;

import java.util.ArrayList;
import java.util.Arrays;

public class BeautyHelper {
    private String itemName;
    private String size;
    private String decription;
    private String gender;
    private String type;
    private int quantity;
    private double price;
    private ArrayList<byte[]> image;
    private ArrayList<Color> colors;
    private String braind;

    private BeautyHelper() {
    }

    public String getBraind() {
        return braind;
    }

    public void setBraind(String braind) {
        this.braind = braind;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }

    public void setColors(ArrayList<Color> colors) {
        this.colors = colors;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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


    public ArrayList<byte[]> getImage() {
        return image;
    }

    public void setImage(ArrayList<byte[]> image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "BeautyHelper{" +
                "itemName='" + itemName + '\'' +
                ", size='" + size + '\'' +
                ", decription='" + decription + '\'' +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", image=" + image +
                ", colors=" + colors +
                ", braind='" + braind + '\'' +
                '}';
    }
}
