package com.etoiledespoir.onlinekvshop.factory.domain.special.type;

import com.etoiledespoir.onlinekvshop.domain.specials.type.SpecialType;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemspecialTypeFactory {
    public static SpecialType getSpecialType(String specialType,String description){
        return new SpecialType.Builder(Igenerator.getSuffixFromClassName(ItemspecialTypeFactory.class))
                .buildSpecialType(specialType)
                .buildDescription(description)
                .build();
    }
}
