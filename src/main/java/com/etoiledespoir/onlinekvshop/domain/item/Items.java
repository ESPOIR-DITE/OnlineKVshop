package com.etoiledespoir.onlinekvshop.domain.item;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
    @Id
    private String id;
    private String name;
    private String description;

    private Items() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Items{" +
                "ItemNumber='" + id + '\'' +
                ", price=" + name +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String name;
        private String description;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder Description(String description){
            this.description=description;
            return this;
        }
        public Items build(){
            Items i=new Items();
            i.description=this.description;
            i.id =this.id;
            i.name=this.name;
            return i;
        }

    }
}
