package com.etoiledespoir.onlinekvshop.factory.domain.contact;

import com.etoiledespoir.onlinekvshop.domain.users.contact.UserContact;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class CustomerContactFactory {
    public static UserContact getCustomerContact(String typeid, String contact){
        return new UserContact.Builder(Igenerator.getSuffixFromClassName(CustomerContactFactory.class))
                .buildContact(contact)
                .buildContactTypeId(typeid).build();
    }
}
