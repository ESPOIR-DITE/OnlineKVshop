package com.etoiledespoir.onlinekvshop.domain.generic.item_picture;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class itemImage {
    @Id
    private String id;
    private String itemId;
    private String imageId;

    private itemImage() {
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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "Item_Pictures{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", imageId='" + imageId + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String itemId;
        private String imageId;
        public Builder(String itemId){
            this.itemId=itemId;
        }
        public Builder buildImageId(String imageId){
            this.imageId=imageId;
            return this;
        }
        public Builder buildId(String id){
            this.id=id;
            return this;
        }
        public itemImage build(){
            itemImage IP=new itemImage();
            IP.imageId=this.imageId;
            IP.itemId=this.itemId;
            IP.id=this.id;
            return IP;
        }
    }
}
