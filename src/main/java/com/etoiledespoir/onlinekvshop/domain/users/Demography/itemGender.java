package com.etoiledespoir.onlinekvshop.domain.users.Demography;

public class itemGender {
    private String itemId;
    private String genderId;

    private itemGender() {
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
        return "itemGender{" +
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
    }
    public itemGender build(){
        itemGender itemGender=new itemGender();
        itemGender.genderId=this.genderId;
        itemGender.itemId=this.itemId;
        return itemGender;
    }
}
