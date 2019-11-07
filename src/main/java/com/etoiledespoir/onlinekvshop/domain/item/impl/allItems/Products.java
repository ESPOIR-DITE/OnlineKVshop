package com.etoiledespoir.onlinekvshop.domain.item.impl.allItems;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    private String id;
    private String name;
    private String description;

    private Products() {
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
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String name;
        private String description;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Products build(){
            Products products=new Products();
            products.description=this.description;
            products.id=this.id;
            products.name=this.name;
            return products;
        }
    }
}
