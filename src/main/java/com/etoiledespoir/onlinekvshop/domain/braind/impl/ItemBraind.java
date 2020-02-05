package com.etoiledespoir.onlinekvshop.domain.braind.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemBraind {
    @Id
    private String id;
    private String itemId;
    private String braindId;


    public ItemBraind() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        private String id;
        private String braindId;
        private String itemId;
        public Builder buildBrainfId(String braindId){
            this.braindId=braindId;
            return this;
        }
        public Builder(String id){
            this.id=id;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public ItemBraind build(){
            ItemBraind itemBraind=new ItemBraind();
            itemBraind.id=this.id;
            itemBraind.braindId=this.braindId;
            itemBraind.itemId=this.itemId;
            return itemBraind;
        }
    }
}
