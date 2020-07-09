package com.etoiledespoir.onlinekvshop.factory.domain.contact;

import com.etoiledespoir.onlinekvshop.domain.users.contact.ContactType;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ContactTypeFactory {
    public static ContactType getContactType(String type){
        return new ContactType.Builder(Igenerator.getSuffixFromClassName(ContactTypeFactory.class))
                .buildContact(type).build();
    }
}
