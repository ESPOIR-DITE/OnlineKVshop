package com.etoiledespoir.onlinekvshop.domain.user.contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserContact {
    @Id
    private String id;
    private String contactTypeId;
    private String contact;

    private UserContact() {
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
        public UserContact build(){
            UserContact userContact =new UserContact();
            userContact.contact=this.contact;
            userContact.id=this.id;
            userContact.contactTypeId=this.contactTypeId;
            return userContact;
        }
    }
}
