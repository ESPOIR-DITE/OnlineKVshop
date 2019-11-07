package com.etoiledespoir.onlinekvshop.factory.domain.contact;

import com.etoiledespoir.onlinekvshop.domain.users.contact.CustomerContact;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class CustomerContactFactory {
    public static CustomerContact getCustomerContact(String typeid,String contact){
        return new CustomerContact.Builder(Igenerator.getSuffixFromClassName(CustomerContactFactory.class))
                .buildContact(contact)
                .buildContactTypeId(typeid).build();
    }
}
