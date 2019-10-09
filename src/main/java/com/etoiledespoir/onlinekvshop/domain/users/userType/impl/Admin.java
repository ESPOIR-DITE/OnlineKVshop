package com.etoiledespoir.onlinekvshop.domain.users.userType.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    private String email;
    private String name;
    private String surName;


    private Admin() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


    @Override
    public String toString() {
        return "Admin{" +
                "id=" + email +
                ", name='" + name + '\'' +
                ", userName='" + surName;
    }

    /**
     * builder start here
     */
    public static class Builder {
        private String email;
        private String name;
        private String surName;


        public Builder(String name) {
            this.name = name;
        }

        public Builder buildEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder buildSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public Admin buil() {
            Admin admin = new Admin();
            admin.surName = this.surName;
            admin.name = this.name;
            admin.email = this.email;
            return admin;

        }
    }
}
