package com.etoiledespoir.onlinekvshop.domain;

public class ItemSold {
    private int id;
    private int itemId;
    private int orderId;

    private ItemSold() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
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

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public static class Builder{
        private int id;
        private int itemId;
        private int orderId;

        public Builder(int id) {
            this.id = id;
        }
        public Builder buildItemIde(int itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildOrder(int orderId){
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
