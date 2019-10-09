package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class CustomerFactory {
    public static Customer getCustomer(String email,String name,String status,String surname){
        return new Customer.Builder(email)
                .builName(name)
                .buildStatus(status)
                .buildSurname(surname)
                .build();
    }
}
