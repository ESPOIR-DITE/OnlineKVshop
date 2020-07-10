package com.etoiledespoir.onlinekvshop.domain.user.contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactType {
    @Id
    private String id;
    private String contact;

    private ContactType() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String type) {
        this.contact = type;
    }

    @Override
    public String toString() {
        return "ContactType{" +
                "id='" + id + '\'' +
                ", id='" + contact + '\'' +
                '}';
    }
    public static class Builder{
        private String type;
        private String id;

        public Builder (String type){
            this.type =type;
        }
        public Builder buildContact(String id ){
            this.id =id;
            return this;
        }
        public ContactType build(){

            ContactType contactType=new ContactType();
            contactType.contact =this.id;
            contactType.id =this.type;
            return contactType;
        }
    }
}
