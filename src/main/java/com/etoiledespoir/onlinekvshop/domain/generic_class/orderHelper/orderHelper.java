package com.etoiledespoir.onlinekvshop.domain.generic_class.orderHelper;

public class orderHelper {
    private String itemNumber;
    private int quantity;
    private String customerId;

    public orderHelper() {
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    @Override
    public String toString() {
        return "orderHelper{" +
                "itemNumber='" + itemNumber + '\'' +
                ", quantity=" + quantity +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
