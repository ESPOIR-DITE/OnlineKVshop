package com.etoiledespoir.onlinekvshop.domain.pic.picHelper;


public class MypicHelpRead {
    private String id;
    private String itemId;
    private String image;
    private String description;

    public MypicHelpRead() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MypicHelpRead{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String itemId;
        private String image;
        private String description;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildImage(String image){
            this.image=image;
            return this;
        }
        public Builder buildDesc(String description){
            this.description=description;
            return this;
        }
        public MypicHelpRead build(){
            MypicHelpRead mhr=new MypicHelpRead();
            mhr.description=this.description;
            mhr.id=this.id;
            mhr.image=this.image;
            mhr.itemId=this.itemId;
            return mhr;
        }
    }
}
