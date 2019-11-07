package com.etoiledespoir.onlinekvshop.domain.color.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemColor {
    @Id
    private String itemId;
    private String colorId;

    public ItemColor() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    @Override
    public String toString() {
        return "ItemColor{" +
                "itemId='" + itemId + '\'' +
                ", colorId='" + colorId + '\'' +
                '}';
    }
    public static class Builder{
        private String itemId;
        private String colorId;
        public Builder(String itemId){
            this.itemId=itemId;
        }
        public Builder buildColer(String colorId){
            this.colorId=colorId;
            return this;
        }
        public ItemColor build(){
            ItemColor itemColor=new ItemColor();
            itemColor.colorId=this.colorId;
            itemColor.itemId=this.itemId;
            return itemColor;
        }
    }
}
