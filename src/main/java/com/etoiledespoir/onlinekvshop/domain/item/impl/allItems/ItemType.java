package com.etoiledespoir.onlinekvshop.domain.item.impl.allItems;

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
        return "ProductType{" +
                "itemId='" + itemId + '\'' +
                ", typeId='" + typeId + '\'' +
                '}';
    }
    public static class Builder{
        private String itemId;
        private String type;
        public Builder(String itemId){
            this.itemId=itemId;
        }
        public Builder buildType(String type){
            this.type=type;
            return this;
        }
        public ItemType build(){
            ItemType itemType =new ItemType();
            itemType.itemId=this.itemId;
            itemType.typeId =this.type;
            return itemType;
        }
    }
}
