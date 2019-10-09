package com.etoiledespoir.onlinekvshop.factory.domain.gender;

import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;

public class GenderFactory {
    public static Gender getGender(String id,String age,String gender,String description){
        return new Gender.Builder(id)
                .buildDescription(description)
                .buildGender(gender)
                .buildAge(age)
                .build();
    }
}
