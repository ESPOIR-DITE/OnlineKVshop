package com.etoiledespoir.onlinekvshop.factory.domain.user.gender;

import com.etoiledespoir.onlinekvshop.domain.users.gender.Gender;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class GenderFactory {
    public static Gender getGender( String gender){
        return new Gender.Builder(Igenerator.getSuffixFromClassName(GenderFactory.class))
                .buildGender(gender)
                .build();
    }
}
