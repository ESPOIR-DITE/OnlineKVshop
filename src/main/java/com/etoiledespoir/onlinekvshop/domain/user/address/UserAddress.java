package com.etoiledespoir.onlinekvshop.domain.user.address;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserAddress {
    @Id
    private String id;
    private String userId;
    private String address;
    private String addressType;
    private String phoneNumber;

    private UserAddress() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AddressHelper{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", address='" + address + '\'' +
                ", addressType='" + addressType + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String userId;
        private String address;
        private String addressType;
        private String phoneNumber;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildUserId(String userId){
            this.userId=userId;
            return this;
        }
        public Builder buildAddress(String address){
            this.address=address;
            return this;
        }
        public Builder buildAddressTypeId(String addressType){
            this.addressType=addressType;
            return this;
        }
        public Builder buildPhone(String phoneNumber){
            this.phoneNumber=phoneNumber;
            return this;
        }
        public UserAddress build(){
            UserAddress userAddress =new UserAddress();
            userAddress.address=this.address;
            userAddress.addressType=this.addressType;
            userAddress.id=this.id;
            userAddress.userId=this.userId;
            userAddress.phoneNumber=this.phoneNumber;
            return userAddress;
        }
    }
}
