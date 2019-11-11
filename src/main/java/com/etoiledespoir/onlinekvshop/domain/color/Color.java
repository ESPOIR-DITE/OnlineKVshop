package com.etoiledespoir.onlinekvshop.domain.color;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Color {
    @Id
    private String colorId;
    private String colorName;

    public Color() {
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorId='" + colorId + '\'' +
                ", colorName='" + colorName + '\'' +
                '}';
    }
    public static class Builder{
        private String colorId;
        private String color;
        public Builder(String colorId){
            this.colorId=colorId;
        }
        public Builder buildColor(String color){
            this.color=color;
            return this;
        }
        public Color build(){
            Color color=new Color();
            color.colorName =this.color;
            color.colorId=this.colorId;
            return color;
        }
    }
}
