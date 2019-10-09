package com.etoiledespoir.onlinekvshop.domain.users.userType.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer{
    @Id
    private String email;
    private String name;
    private String surName;
    private String  id;
    private String status;
    /**
     * builder start here
     */
    public  static class Builder {
        private String name;
        private String  id;
        private String email;
        private String status;
        private String surName;

        public Builder(String id){
            this.id=id;
        }
        public Builder builName(String name){
            this.name=name;
            return this;
        }
        public Builder buildEmail(String email){
            this.email=email;
            return this;
        }
        public Builder buildSurname(String surName){
            this.surName=surName;
            return this;
        }
        public Builder buildStatus(String status){
            this.status=status;
            return this;
        }
        public Customer build(){
            Customer customer=new Customer();
            customer.email=this.email;
            customer.id=this.id;
            customer.name=this.name;
            customer.status=this.status;
            customer.surName=this.surName;
            return customer;
        }
        public Builder copy(Customer customer){
            this.email=customer.email;
            this.name=customer.name;
            this.id=customer.id;
            this.status=customer.status;

            this.surName=customer.surName;
            return this;
        }

    }//end Builder

    private Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", id='" + id + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
