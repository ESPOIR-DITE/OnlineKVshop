package com.etoiledespoir.onlinekvshop.domain.users.contact;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactType {
    @Id
    private String id;
    private String type;

    private ContactType() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ContactType{" +
                "id='" + id + '\'' +
                ", id='" + type + '\'' +
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
            contactType.type =this.id;
            contactType.id =this.type;
            return contactType;
        }
    }
}
