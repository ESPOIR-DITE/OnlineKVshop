package com.etoiledespoir.onlinekvshop.domain.users.Demography;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gender {
    @Id
    private String id;
    private String gender;
    @Column(name = "Item_description" )
    private String description;

    private Gender() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String gender;
        private String description;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildGender(String gender){
            this.gender=gender;
            return this;
        }
        public Builder buildDescription(String description){
            this.description=description;
            return this;
        }
        public Gender build(){
            Gender gender= new Gender();
            gender.description=this.description;
            gender.gender=this.gender;
            gender.description=this.description;
            return gender;
        }
    }
}
