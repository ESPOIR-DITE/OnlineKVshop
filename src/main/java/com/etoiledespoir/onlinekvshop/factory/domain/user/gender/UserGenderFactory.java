package com.etoiledespoir.onlinekvshop.factory.domain.user.gender;

import com.etoiledespoir.onlinekvshop.domain.user.gender.UserGender;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class UserGenderFactory {
    public static UserGender getCustomerGender(String customerId, String genderId, String age){
        return new UserGender.Builder(customerId).buildId(Igenerator.getSuffixFromClassName(UserGenderFactory.class)).buildAge(age).buildGenderId(genderId).build();
    }
}
