package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class CustomerFactory {
    public static Customer getCustomer(String email,String name,String status,String surname){
        return new Customer.Builder(Igenerator.getSuffixFromClassName(CustomerFactory.class))
                .builName(name)
                .buildEmail(email)
                .buildStatus(status)
                .buildSurname(surname)
                .build();
    }
    public static Customer updateCustomer(String email,String name,String id,String status,String surname){
        return new Customer.Builder(id)
                .builName(name)
                .buildEmail(email)
                .buildStatus(status)
                .buildSurname(surname)
                .build();
    }

}
