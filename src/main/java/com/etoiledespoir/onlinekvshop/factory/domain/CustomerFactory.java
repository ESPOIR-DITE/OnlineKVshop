package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;

public class CustomerFactory {
    public static Customer buildCustomer(String name,int id,String email,String password,String address,String status)
    {
        return new Customer.Builder(id).builName(name)
                .buildEmail(email)
                .buildAddress(address)
                .buildPassword(password)
                .buildStatus(status)
                .build();
    }
    public static Customer buildCust(int id){
        return new Customer.Builder(id).build();
    }
}
