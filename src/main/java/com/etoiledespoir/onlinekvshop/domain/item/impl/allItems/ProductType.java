package com.etoiledespoir.onlinekvshop.domain.item.impl.allItems;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductType {
    @Id
    private String itemId;
    private String typeId;

    private ProductType() {
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
        public ProductType build(){
            ProductType productType=new ProductType();
            productType.itemId=this.itemId;
            productType.typeId =this.type;
            return productType;
        }
    }
}
