package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.impl.Shoes;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ShoesFactory {
    public static Shoes getShoes(String marque,String size,String gender,String decription){
        return new Shoes.Builder(Igenerator.getSuffixFromClassName(ShoesFactory.class))
                .buildDescription(decription)
                .buildGender(gender)
                .buildMarque(marque)
                .buildSize(size)
                .build();
    }
    public static Shoes updateShoes(String id,String marque,String size,String gender,String decription){
        return new Shoes.Builder(id)
                .buildDescription(decription)
                .buildGender(gender)
                .buildMarque(marque)
                .buildSize(size)
                .build();
    }
}
