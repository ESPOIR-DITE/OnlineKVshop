package com.etoiledespoir.onlinekvshop.domain.users.address.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Address {
    @Id
    private String id;
    private String address;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Address() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String address;
        private String phoneNumber;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildAddress(String address){
            this.address =address;
            return this;
        }
        public Builder buildPhoneNumber(String phonenumber){
            this.phoneNumber=phonenumber;
            return this;
        }

        public Address build(){
            Address A= new Address();
            A.id=this.id;
            A.address =this.address;
            return A;
        }
    }
}
