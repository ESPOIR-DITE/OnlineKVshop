package com.etoiledespoir.onlinekvshop.factory.domain.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.bridge.CustomerGender;

public class CustomerGederFactory {
    public static CustomerGender getCustomerGender(String customerId,String genderId,String age){
        return new CustomerGender.Builder(customerId).buildAge(age).buildGenderId(genderId).build();
    }
}
