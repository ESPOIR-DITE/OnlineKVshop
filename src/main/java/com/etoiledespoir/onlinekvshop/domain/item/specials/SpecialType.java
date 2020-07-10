package com.etoiledespoir.onlinekvshop.domain.item.specials;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpecialType {
    @Id
    private String id;
    private String specialType;
    private String description;

    private SpecialType() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecialType() {
        return specialType;
    }

    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SpecialType{" +
                "Id='" + id + '\'' +
                ", specialType='" + specialType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String specialType;
        private String description;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildSpecialType(String specialType){
            this.specialType=specialType;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public SpecialType build(){
            SpecialType specialType=new SpecialType();
            specialType.description=this.description;
            specialType.id=this.id;
            specialType.specialType=this.specialType;
            return specialType;
        }
    }
}
