package com.etoiledespoir.onlinekvshop.domain.specials;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemSpecial {
    @Id
    private String specialId;
    private String title;
    private String itemId;
    private String period;
    private String endPeriod;
    private String description;
    private double previousePrice;
    private double actualPrice;

    private ItemSpecial() {
    }

    public String getSpecialId() {
        return specialId;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPreviousePrice() {
        return previousePrice;
    }

    public void setPreviousePrice(double previousePrice) {
        this.previousePrice = previousePrice;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    @Override
    public String toString() {
        return "ItemSpecial{" +
                "specialId='" + specialId + '\'' +
                ", title='" + title + '\'' +
                ", itemId='" + itemId + '\'' +
                ", period='" + period + '\'' +
                ", endPeriod='" + endPeriod + '\'' +
                ", description='" + description + '\'' +
                ", previousePrice=" + previousePrice +
                ", actualPrice=" + actualPrice +
                '}';
    }

    public static class Builder{
        private String specialId;
        private String title;
        private String itemId;
        private String period;
        private String endPeriod;
        private String description;
        private double previousePrice;
        private double actualPrice;

        public Builder(String specialId){
            this.specialId=specialId;
        }
        public Builder buildEndPeriod(String endPeriod){
            this.endPeriod=endPeriod;
            return this;
        }
        public Builder builTitle(String title){
            this.title=title;
            return this;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildPeriod(String period){
            this.period=period;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Builder buildPreviousPrice(double previousePrice){
            this.previousePrice=previousePrice;
            return this;
        }
        public Builder buildAcrualPrice(double actualPrice){
            this.actualPrice=actualPrice;
            return this;
        }
        public ItemSpecial build(){
            ItemSpecial itemSpecial=new ItemSpecial();
            itemSpecial.title=this.title;
            itemSpecial.specialId=this.specialId;
            itemSpecial.actualPrice=this.actualPrice;
            itemSpecial.description=this.description;
            itemSpecial.period=this.period;
            itemSpecial.previousePrice=this.previousePrice;
            itemSpecial.period=this.period;
            itemSpecial.itemId=this.itemId;
            itemSpecial.endPeriod=this.endPeriod;
            return itemSpecial;
        }
    }
}
