package com.etoiledespoir.onlinekvshop.domain.users.userType.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin  {
@Id
    private int id;
    private String name;
    private String surName;
    private String email;

    private Admin() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String password) {
        this.email = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + surName + '\'' +
                ", password='" + email + '\'' +
                '}';
    }

    /**
     * builder start here
     */
    public static class Builder
    {
        private int id;
        private String name;
        private String surName;
        private String email;

        public Builder(String name) {
            this.name = name;
        }
        public Builder buildId(int id){
            this.id=id;
            return this;
        }
        public Builder buildsurName(String userName){
            this.surName=userName;
            return this;
        }
        public Builder builderEmail(String email){
            this.email=email;
            return this;
        }
        public Admin builAdmin(){
            Admin admin= new Admin();
            admin.surName=this.surName;
            admin.name=this.name;
            admin.email=this.email;
            admin.id=this.id;
            return admin;

        }
    }
}
