package com.etoiledespoir.onlinekvshop.domain.item.impl.shoes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shoes  {
    @Id
    private String ItemNumber;
    private String size;
    private Shoes() {
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
        return "Shoes{" +
                ", ItemNumber='" + ItemNumber + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static class Builder{
        private String ItemNumber;
        private String size;

        public Builder(String itemNumber){
            this.ItemNumber=itemNumber;
        }

        public Builder buildSize(String size){
            this.size=size;
            return this;
        }

        public Shoes build(){
            Shoes s=new Shoes();
            s.ItemNumber=this.ItemNumber;
            s.size=this.size;
            return s;
        }
    }
}
