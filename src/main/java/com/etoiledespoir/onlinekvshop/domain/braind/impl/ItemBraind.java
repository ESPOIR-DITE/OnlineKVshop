package com.etoiledespoir.onlinekvshop.domain.braind.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemBraind {
    @Id
    private String itemId;
    private String braindId;


    public ItemBraind() {
    }

    public String getBraindId() {
        return braindId;
    }

    public void setBraindId(String braindId) {
        this.braindId = braindId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "ItemBraind{" +
                "braindId='" + braindId + '\'' +
                ", itemId='" + itemId + '\'' +
                '}';
    }
    public static class Builder{
        private String braindId;
        private String itemId;
        public Builder(String braindId){
            this.braindId=braindId;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public ItemBraind build(){
            ItemBraind itemBraind=new ItemBraind();
            itemBraind.braindId=this.braindId;
            itemBraind.itemId=this.itemId;
            return itemBraind;
        }
    }
}
