package com.etoiledespoir.onlinekvshop.domain.pic.picHelper;


import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.domain.size.Size;

import java.util.ArrayList;

public class MypicHelpRead {
    private String name;
    private String braind;
    private String gender;
    private double price;
    private ArrayList<String> image;
    private String description;
    private ArrayList<Color> colors;
    private ArrayList<Size> sizes;
    private String itemType;

    private MypicHelpRead() {
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }

    public void setColors(ArrayList<Color> colors) {
        this.colors = colors;
    }

    public ArrayList<Size> getSizes() {
        return sizes;
    }

    public void setSizes(ArrayList<Size> sizes) {
        this.sizes = sizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBraind() {
        return braind;
    }

    public void setBraind(String braind) {
        this.braind = braind;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getImage() {
        return image;
    }

    public void setImage(ArrayList<String> image) {
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
                "name='" + name + '\'' +
                ", braind='" + braind + '\'' +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                ", image=" + image +
                ", description='" + description + '\'' +
                ", colors=" + colors +
                ", sizes=" + sizes +
                ", itemType='" + itemType + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String braind;
        private String gender;
        private double price;
        private ArrayList<String> image;
        private String description;
        private ArrayList<Color> colors;
        private ArrayList<Size> sizes;
        private String itemType;
        public Builder(String name){
            this.name=name;
        }
        public Builder buildItemType(String itemType){
            this.itemType=itemType;
            return this;
        }

        public Builder buildColors(ArrayList<Color> colors){
            this.colors=colors;
            return this;
        }
        public Builder buildSize(ArrayList<Size> sizes) {
            this.sizes = sizes;
            return this;
        }
        public Builder buildBraind(String braind){
            this.braind=braind;
            return this;
        }
        public Builder buildGender(String gender){
            this.gender=gender;
            return this;
        }
        public Builder buildPrice(double price){
            this.price=price;
            return this;
        }
        public Builder buildImage(ArrayList<String> image){
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
            mhr.name=this.name;
            mhr.image=this.image;
            mhr.price=this.price;
            mhr.braind=this.braind;
            mhr.gender=this.gender;
            mhr.colors=this.colors;
            mhr.sizes=this.sizes;
            mhr.itemType=this.itemType;
            return mhr;
        }
    }
}
