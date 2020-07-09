package com.etoiledespoir.onlinekvshop.domain.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User  {
    @Id
    private String email;
    private String name;
    private String surName;
    private String status;

    public User(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
        this.status = builder.status;
        this.surName = builder.surName;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getStatus() {
        return status;
    }
    public static class Builder{
        private String email;
        private String name;
        private String surName;
        private String status;

        public Builder(String email){
            this.email = email;
        }
        public Builder buildName(String name){
            this.name = name;
            return this;
        }
        public Builder buildSurName(String surName){
            this.surName = surName;
            return this;
        }
        public Builder builderStatus(String status){
            this.status = status;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
