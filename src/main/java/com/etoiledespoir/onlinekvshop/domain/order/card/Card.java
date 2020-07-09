package com.etoiledespoir.onlinekvshop.domain.order.card;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {
    @Id
    private String id;
    private String itemId;
    private String customerId;
    private int quantity;

    private Card() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String itemId;
        private String customerId;
        private int quantity;


        public Builder(String id){
            this.id=id;
        }
        public Builder buildQuantity(int quantity){
            this.quantity=quantity;
            return this;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildCustomer(String customerId){
            this.customerId=customerId;
            return this;
        }
        public Card build(){
            Card card= new Card();
            card.customerId=this.customerId;
            card.id=this.id;
            card.itemId=this.itemId;
            card.quantity=this.quantity;
            return card;
        }
    }
}
