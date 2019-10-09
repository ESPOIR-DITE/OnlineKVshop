package com.etoiledespoir.onlinekvshop.domain.users.userType.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerBridge {
    @Id
    private String id;
    private String email;
    private String addressId;
    private String genderId;

    private CustomerBridge() {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    @Override
    public String toString() {
        return "CustomerBridge{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", addressId='" + addressId + '\'' +
                ", genderId='" + genderId + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String email;
        private String addressId;
        private String genderId;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildEmail(String email){
            this.email=email;
            return this;
        }
        public Builder buildAddressId(String addressId){
            this.addressId=addressId;
            return this;
        }
        public Builder buildGenderId(String genderId){
            this.genderId=genderId;
            return this;
        }
        public CustomerBridge build(){
            CustomerBridge c=new CustomerBridge();
            c.id=this.id;
            c.email=this.email;
            c.addressId=this.addressId;
            c.genderId=this.genderId;
            return c;
        }
    }
}
