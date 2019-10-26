package com.etoiledespoir.onlinekvshop.domain.item.accounting;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private String itemNumber;
    private double price;
    private int quantity;

    private Account() {
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
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
        return "Accountint{" +
                "ItemNumber='" + this.itemNumber + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    public static class Builder{
        private String itemNumber;
        private double price;
        private int quantity;
        public Builder(String itemNumber){
            this.itemNumber=itemNumber;
        }
        public Builder buildProce(double price){
            this.price=price;
            return this;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public Account build(){
            Account account=new Account();
            account.itemNumber=this.itemNumber;
            account.price=this.price;
            account.quantity=this.quantity;
            return account;
        }
    }
}
