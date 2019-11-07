package com.etoiledespoir.onlinekvshop.domain.itemType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemType {
    @Id
    private String itemId;
    private String typeId;

    private ItemType() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "itemId='" + itemId + '\'' +
                ", typeId='" + typeId + '\'' +
                '}';
    }
    public static class Builder{
        private String itemId;
        private String typeId;
        public Builder(String id){
            this.itemId=id;
        }
        public Builder buildTypeId(String typeId){
            this.typeId=typeId;
            return this;
        }
        public ItemType build(){
            ItemType itemType=new ItemType();
            itemType.itemId=this.itemId;
            itemType.typeId=this.typeId;
            return itemType;
        }
    }
}
