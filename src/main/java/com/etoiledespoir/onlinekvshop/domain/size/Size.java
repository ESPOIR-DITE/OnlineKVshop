package com.etoiledespoir.onlinekvshop.domain.size;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Size {
    @Id
    private String id;
    private String size;

    private Size() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Size{" +
                "id='" + id + '\'' +
                ", size='" + size + '\'' +
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
            size.size=this.size;
            return size;
        }
    }
}
