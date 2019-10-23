package com.etoiledespoir.onlinekvshop.domain.item.impl.beate;

import java.util.Arrays;

public class BeautyHelper {
    private String itemName;
    private String size;
    private String decription;
    private String color;
    private byte[] image;

    private BeautyHelper() {
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

    @Override
    public String toString() {
        return "BeautyHelper{" +
                ", ItemName='" +this.itemName + '\'' +
                ", size='" + size + '\'' +
                ", decription='" + decription + '\'' +
                ", color='" + color + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
