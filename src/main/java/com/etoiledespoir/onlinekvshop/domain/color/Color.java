package com.etoiledespoir.onlinekvshop.domain.color;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Color {
    @Id
    private String colorId;
    private String color;

    public Color() {
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorId='" + colorId + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public static class Builder{
        private String colorId;
        private String color;
        public Builder(String colorId){
            this.colorId=colorId;
        }
        public Builder buildColor(String color){
            this.colorId=color;
            return this;
        }
        public Color build(){
            Color color=new Color();
            color.color=this.color;
            color.colorId=this.colorId;
            return color;
        }
    }
}
