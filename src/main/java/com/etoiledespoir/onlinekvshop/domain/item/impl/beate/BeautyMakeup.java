package com.etoiledespoir.onlinekvshop.domain.item.impl.beate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BeautyMakeup {
    @Id
    private String ItemNumber;
    private String size;

    private BeautyMakeup() {
    }
    public String getItemNumber() {
        return ItemNumber;
    }
    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BeautyMakeup{" +
                "ItemNumber='" + ItemNumber + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    public static class Builder {
        private String ItemNumber;
        private String size;
        private String decription;

        public Builder(String itemNumber) {
            this.ItemNumber = itemNumber;
        }
        public Builder buildSize(String size) {
            this.size = size;
            return this;
        }

        public Builder buildDescription(String decription) {
            this.decription = decription;
            return this;
        }

        public BeautyMakeup build() {
            BeautyMakeup b = new BeautyMakeup();
            b.ItemNumber = this.ItemNumber;
            b.size = this.size;
            return b;
        }

    }
}
