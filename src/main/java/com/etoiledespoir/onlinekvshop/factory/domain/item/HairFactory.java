package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.impl.hair.Hair;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class HairFactory {
    public static Hair getHair(String langueur,String matiere,String poids){
        return new Hair.Builder(Igenerator.getSuffixFromClassName(HairFactory.class))
                .buildLongueur(langueur)
                .buildMaterial(matiere)
                .buildPoids(poids)
                .build();
    }
    public static Hair updategetHair(String id,String langueur,String matiere,String poids){
        return new Hair.Builder(id)
                .buildLongueur(langueur)
                .buildMaterial(matiere)
                .buildPoids(poids)
                .build();
    }
}
