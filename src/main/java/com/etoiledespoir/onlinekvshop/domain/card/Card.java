package com.etoiledespoir.onlinekvshop.domain.card;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {
    @Id
    private String id;
    private String itemId;
    private String customerId;

    private Card() {
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

        public Builder(String id){
            this.id=id;
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
            return card;
        }
    }
}
