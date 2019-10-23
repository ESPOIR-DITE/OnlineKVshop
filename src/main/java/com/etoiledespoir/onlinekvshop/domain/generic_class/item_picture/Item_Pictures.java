package com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item_Pictures {
    @Id
    private String itemId;
    private String imageId;

    private Item_Pictures() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "Item_Pictures{" +
                "itemId='" + itemId + '\'' +
                ", imageId='" + imageId + '\'' +
                '}';
    }
    public static class Builder{
        private String itemId;
        private String imageId;
        public Builder(String itemId){
            this.itemId=itemId;
        }
        public Builder buildImageId(String imageId){
            this.imageId=imageId;
            return this;
        }
        public Item_Pictures build(){
            Item_Pictures IP=new Item_Pictures();
            IP.imageId=this.imageId;
            IP.itemId=this.itemId;
            return IP;
        }
    }
}
