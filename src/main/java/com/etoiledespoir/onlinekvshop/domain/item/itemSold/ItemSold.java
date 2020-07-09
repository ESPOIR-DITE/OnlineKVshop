package com.etoiledespoir.onlinekvshop.domain.item.itemSold;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemSold {
    @Id
    private String id;
    private String itemId;
    private String orderId;

    private ItemSold() {
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

    @Override
    public String toString() {
        return "ItemSold{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", orderId=" + orderId +
                '}';
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public static class Builder{
        private String id;
        private String itemId;
        private String orderId;

        public Builder(String id) {
            this.id = id;
        }
        public Builder buildItemIde(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildOrder(String orderId){
            this.orderId=orderId;
            return this;
        }
        public ItemSold getItemSold(){
            ItemSold itemSold=new ItemSold();
            itemSold.id=this.id;
            itemSold.itemId=this.itemId;
            itemSold.orderId=this.orderId;
            return itemSold;
        }

    }
}
