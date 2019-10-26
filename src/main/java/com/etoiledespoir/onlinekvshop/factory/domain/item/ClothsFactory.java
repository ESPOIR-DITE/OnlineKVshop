package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.impl.cloths.Cloths;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ClothsFactory {
    public static Cloths getCloths(String matiere,String size){
        return new Cloths.Builder(Igenerator.getSuffixFromClassName(ClothsFactory.class))
                .buildMatiriel(matiere)
                .buildSize(size)
                .build();
    }
    public static Cloths updateCloths(String itemNumber,String matiere,String size){
        return new Cloths.Builder(itemNumber)
                .buildMatiriel(matiere)
                .buildSize(size)
                .build();
    }
}
