package com.etoiledespoir.onlinekvshop.factory.domain.user.gender;

import com.etoiledespoir.onlinekvshop.domain.users.gender.UserGender;

public class UserGenderFactory {
    public static UserGender getCustomerGender(String customerId, String genderId, String age){
        return new UserGender.Builder(customerId).buildAge(age).buildGenderId(genderId).build();
    }
}
