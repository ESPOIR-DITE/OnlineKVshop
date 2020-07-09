package com.etoiledespoir.onlinekvshop.domain.users.address;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Address {
    @Id
    private String userId;
    private String address;
    private String addressTypeId;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(String addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Address() {
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
                ", userId='" + userId + '\'' +
                ", address='" + address + '\'' +
                ", addressTypeId='" + addressTypeId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String address;
        private String userId;
        private String phoneNumber;
        private String addressTypeId;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildAddress(String address){
            this.address =address;
            return this;
        }
        public Builder buildAddressTypeId(String addressTypeId){
            this.addressTypeId=addressTypeId;
            return this;
        }
        public Builder buildUserId(String userId){
            this.userId=userId;
            return this;
        }
        public Builder buildPhoneNumber(String phonenumber){
            this.phoneNumber=phonenumber;
            return this;
        }

        public Address build(){
            Address A= new Address();
            A.address =this.address;
            A.phoneNumber=this.phoneNumber;
            A.userId=this.userId;
            A.addressTypeId=this.addressTypeId;
            return A;
        }
    }
}
