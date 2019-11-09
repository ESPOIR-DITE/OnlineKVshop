package com.etoiledespoir.onlinekvshop.domain.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
    @Id
    private String ItemNumber;
    private String name;
    private String typeName;
    @Column(name = "item_description" )
    private String description;

    private Items() {
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getNane() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setQuantity(String type) {
        this.typeName = type;
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
                "ItemNumber='" + ItemNumber + '\'' +
                ", price=" + name +
                ", quantity=" + typeName +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String ItemNumber;
        private String name;
        private String type;
        private String description;

        public Builder(String itemNumber){
            this.ItemNumber=itemNumber;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildType(String type){
            this.type=type;
            return this;
        }
        public Builder Description(String description){
            this.description=description;
            return this;
        }
        public Items build(){
            Items i=new Items();
            i.description=this.description;
            i.ItemNumber=this.ItemNumber;
            i.name=this.name;
            i.typeName =this.type;
            return i;
        }

    }
}
