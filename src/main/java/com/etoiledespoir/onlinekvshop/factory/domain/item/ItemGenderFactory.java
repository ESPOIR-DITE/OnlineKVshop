package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.gender.ItemGender;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemGenderFactory {
    public static ItemGender getItemGender(String itemId,String genderId){
        return new ItemGender.Builder(Igenerator.getSuffixFromClassName(ItemGenderFactory.class)).buildItemId(itemId).buildGenderId(genderId).build();
    }
}
