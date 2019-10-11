package com.etoiledespoir.onlinekvshop.factory.domain.gender;

import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class GenderFactory {
    public static Gender getGender(int age,String gender,String description){
        return new Gender.Builder(Igenerator.getSuffixFromClassName(GenderFactory.class))
                .buildDescription(description)
                .buildGender(gender)
                .buildAge(age)
                .build();
    }
}
