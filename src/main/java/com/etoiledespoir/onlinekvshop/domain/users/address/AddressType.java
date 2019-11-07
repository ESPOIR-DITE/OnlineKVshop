package com.etoiledespoir.onlinekvshop.domain.users.address;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressType {
    @Id
    private String addressTypeId;
    private String type;

    private AddressType() {
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(String addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AddressType{" +
                "addressTypeId='" + addressTypeId + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public static class Builder{
        private String addressTypeId;
        private String type;

        public Builder(String addressTypeId){
            this.addressTypeId=addressTypeId;
        }
        public Builder buildType(String type){
            this.type=type;
            return this;
        }
        public AddressType build(){
            AddressType AT=new AddressType();
            AT.addressTypeId=this.addressTypeId;
            AT.type=this.type;
            return AT;
        }
    }
}
