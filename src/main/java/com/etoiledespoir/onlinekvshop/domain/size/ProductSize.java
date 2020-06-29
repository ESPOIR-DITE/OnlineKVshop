package com.etoiledespoir.onlinekvshop.domain.size;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductSize {
    @Id
    private String id;
    private String itemId;
    private String sizeId;

    private  ProductSize() {
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

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    @Override
    public String toString() {
        return "ProductSize{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", sizeId='" + sizeId + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String itemId;
        private String sizeId;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildSizeId(String sizeId){
            this.sizeId=sizeId;
            return this;
        }
        public ProductSize build(){
            ProductSize productSize=new ProductSize();
            productSize.id=this.id;
            productSize.itemId=this.itemId;
            productSize.sizeId=this.sizeId;
            return productSize;
        }
    }
}
