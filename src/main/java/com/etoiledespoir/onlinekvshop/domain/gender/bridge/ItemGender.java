package com.etoiledespoir.onlinekvshop.domain.gender.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemGender {
    @Id
    private String itemId;
    private String genderId;

    private ItemGender() {
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
        private String itemId;
        private String genderId;
        public Builder(String itemId){
            this.itemId=itemId;
        }
        public Builder buildGenderId(String genderId){
            this.genderId=genderId;
            return this;
        }
        public ItemGender build(){
            ItemGender itemGender=new ItemGender();
            itemGender.genderId=this.genderId;
            itemGender.itemId=this.itemId;
            return itemGender;
        }
    }
}
