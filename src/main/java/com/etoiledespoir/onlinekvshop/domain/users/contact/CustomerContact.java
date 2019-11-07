package com.etoiledespoir.onlinekvshop.domain.users.contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerContact {
    @Id
    private String id;
    private String contactTypeId;
    private String contact;

    private CustomerContact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(String contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "CustomerContact{" +
                "id='" + id + '\'' +
                ", contactTypeId='" + contactTypeId + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String contactTypeId;
        private String contact;
        public Builder(String userId){
            this.id=userId;
        }
        public Builder buildContactTypeId(String contactTypeId){
            this.contactTypeId=contactTypeId;
            return this;
        }
        public Builder buildContact(String contact){
            this.contact=contact;
            return this;
        }
        public CustomerContact build(){
            CustomerContact customerContact=new CustomerContact();
            customerContact.contact=this.contact;
            customerContact.id=this.id;
            customerContact.contactTypeId=this.contactTypeId;
            return customerContact;
        }
    }
}
