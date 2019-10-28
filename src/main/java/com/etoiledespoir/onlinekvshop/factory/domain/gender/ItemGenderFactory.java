package com.etoiledespoir.onlinekvshop.factory.domain.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;

public class ItemGenderFactory {
    public static ItemGender getItemGender(String itemId,String genderId){
        return new ItemGender.Builder(itemId).buildGenderId(genderId).build();
    }
}
