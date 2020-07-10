package com.etoiledespoir.onlinekvshop.domain.item.color;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemColor {
    @Id
    private String id;
    private String itemId;
    private String colorId;

    public ItemColor() {
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
        private String id;
        private String itemId;
        private String colorId;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildColer(String colorId){
            this.colorId=colorId;
            return this;
        }
        public ItemColor build(){
            ItemColor itemColor=new ItemColor();
            itemColor.id=this.id;
            itemColor.colorId=this.colorId;
            itemColor.itemId=this.itemId;
            return itemColor;
        }
    }
}
