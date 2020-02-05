package com.etoiledespoir.onlinekvshop.factory.domain.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemGenderFactory {
    public static ItemGender getItemGender(String itemId,String genderId){
        return new ItemGender.Builder(Igenerator.getSuffixFromClassName(ItemGenderFactory.class)).buildItemId(itemId).buildGenderId(genderId).build();
    }
}
