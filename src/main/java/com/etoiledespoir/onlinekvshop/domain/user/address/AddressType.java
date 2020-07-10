package com.etoiledespoir.onlinekvshop.domain.user.address;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressType {
    @Id
    private String id;
    private String addressType;

    private AddressType() {
    }

    public String getId() {
        return id;
    }

    public void setId(String addressTypeId) {
        this.id = addressTypeId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "AddressType{" +
                "addressTypeId='" + id + '\'' +
                ", addressType='" + addressType + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String type;

        public Builder(String addressTypeId){
            this.id =addressTypeId;
        }
        public Builder buildType(String type){
            this.type=type;
            return this;
        }
        public AddressType build(){
            AddressType AT=new AddressType();
            AT.id =this.id;
            AT.addressType =this.type;
            return AT;
        }
    }
}
