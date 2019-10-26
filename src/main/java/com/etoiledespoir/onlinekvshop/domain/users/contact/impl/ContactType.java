package com.etoiledespoir.onlinekvshop.domain.users.contact.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactType {
    @Id
    private String contactType;
    private String contact;

    private ContactType() {
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "ContactType{" +
                "contactType='" + contactType + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
    public static class Builder{
        private String contactType;
        private String contact;

        public Builder (String contactType){
            this.contactType=contactType;
        }
        public Builder buildContact(String contact ){
            this.contact=contact;
            return this;
        }
        public ContactType build(){

            ContactType contactType=new ContactType();
            contactType.contact=this.contact;
            contactType.contactType=this.contactType;
            return contactType;
        }
    }
}
