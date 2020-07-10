package com.etoiledespoir.onlinekvshop.domain.item.braind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemBrand {
    @Id
    private String id;
    private String itemId;
    private String brandId;


    public ItemBrand() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String braindId) {
        this.brandId = braindId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "ItemBraind{" +
                "braindId='" + brandId + '\'' +
                ", itemId='" + itemId + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String braindId;
        private String itemId;
        public Builder buildBrainfId(String braindId){
            this.braindId=braindId;
            return this;
        }
        public Builder(String id){
            this.id=id;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public ItemBrand build(){
            ItemBrand itemBrand =new ItemBrand();
            itemBrand.id=this.id;
            itemBrand.brandId =this.braindId;
            itemBrand.itemId=this.itemId;
            return itemBrand;
        }
    }
}
