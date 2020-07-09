package com.etoiledespoir.onlinekvshop.domain.item.size;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Size {
    @Id
    private String id;
    private String sizeNumber;

    private Size() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSizeNumber() {
        return sizeNumber;
    }

    public void setSizeNumber(String sizeNumber) {
        this.sizeNumber = sizeNumber;
    }

    @Override
    public String toString() {
        return "Size{" +
                "id='" + id + '\'' +
                ", sizeNumber='" + sizeNumber + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String size;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildSize(String size){
            this.size=size;
            return this;
        }
        public Size build(){
            Size size=new Size();
            size.id=this.id;
            size.sizeNumber =this.size;
            return size;
        }
    }
}
