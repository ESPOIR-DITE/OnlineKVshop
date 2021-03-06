package com.etoiledespoir.onlinekvshop.domain.item.checkout;

import java.util.Arrays;

public class CheckOut {
    private byte[] image;
    private String description;
    private double price;
    private int quantity;
    private double total;
    private String itemId;

    public CheckOut() {
    }

    public CheckOut(byte[] image, String description, double price, int quantity, double total,String itemId) {
        this.image = image;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
        this.itemId=itemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "CheckOut{" +
                "image=" + Arrays.toString(image) +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
