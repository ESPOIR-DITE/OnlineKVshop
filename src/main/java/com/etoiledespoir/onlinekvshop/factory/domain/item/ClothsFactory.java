package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.impl.cloths.Cloths;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ClothsFactory {
    public static Cloths getCloths(String itemName,String itemType,String size,String marque,String gender,String decription,String color){
        return new Cloths.Builder(Igenerator.getSuffixFromClassName(ClothsFactory.class))
                .buildColor(color)
                .buildGender(gender)
                .buildDescription(decription)
                .buildItemType(itemType)
                .buildMarque(marque)
                .buildName(itemName)
                .build();
    }
    public static Cloths getCloths(String itemNumber,String itemName,String itemType,String size,String marque,String gender,String decription,String color){
        return new Cloths.Builder(itemNumber)
                .buildColor(color)
                .buildGender(gender)
                .buildDescription(decription)
                .buildItemType(itemType)
                .buildMarque(marque)
                .buildName(itemName)
                .build();
    }
}
