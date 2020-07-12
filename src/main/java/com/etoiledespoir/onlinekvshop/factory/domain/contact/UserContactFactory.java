package com.etoiledespoir.onlinekvshop.factory.domain.contact;

import com.etoiledespoir.onlinekvshop.domain.user.contact.UserContact;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class UserContactFactory {
    public static UserContact getUserContact(String typeid, String contact){
        return new UserContact.Builder(Igenerator.getSuffixFromClassName(UserContactFactory.class))
                .buildContact(contact)
                .buildContactTypeId(typeid).build();
    }
}
