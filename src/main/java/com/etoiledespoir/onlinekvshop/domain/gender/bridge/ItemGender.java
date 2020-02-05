package com.etoiledespoir.onlinekvshop.domain.gender.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemGender {
    @Id
    private String id;
    private String itemId;
    private String genderId;

    private ItemGender() {
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

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    @Override
    public String toString() {
        return "ItemGender{" +
                "itemId='" + itemId + '\'' +
                ", genderId='" + genderId + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String itemId;
        private String genderId;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildGenderId(String genderId){
            this.genderId=genderId;
            return this;
        }
        public ItemGender build(){
            ItemGender itemGender=new ItemGender();
            itemGender.id=this.id;
            itemGender.genderId=this.genderId;
            itemGender.itemId=this.itemId;
            return itemGender;
        }
    }
}
