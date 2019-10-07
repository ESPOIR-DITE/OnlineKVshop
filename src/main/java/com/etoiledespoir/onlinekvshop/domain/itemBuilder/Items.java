package com.etoiledespoir.onlinekvshop.domain.itemBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
    @Id
    private String ItemNumber;
    private double price;
    private int quantity;
    @Column(name = "item_description" )
    private String description;

    private Items() {
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
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

    @Override
    public String toString() {
        return "Items{" +
                "ItemNumber='" + ItemNumber + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String ItemNumber;
        private double price;
        private int quantity;
        private String description;

        public Builder(String itemNumber){
            this.ItemNumber=itemNumber;
        }
        public Builder buildPrice(double price){
            this.price=price;
            return this;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public Builder Description(String description){
            this.description=description;
            return this;
        }
        public Items build(){
            Items i=new Items();
            i.description=this.description;
            i.ItemNumber=this.ItemNumber;
            i.price=this.price;
            i.quantity=this.quantity;
            return i;
        }

    }
}
