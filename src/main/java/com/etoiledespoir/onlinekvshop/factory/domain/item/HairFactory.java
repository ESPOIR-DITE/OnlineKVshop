package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Hair;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class HairFactory {
    public static Hair getHair(String Itemname,String type,String size,String gender,String decription,String color){
        return new Hair.Builder(Igenerator.getSuffixFromClassName(HairFactory.class))
                .buildColor(color)
                .buildDescription(decription)
                .buildGender(gender)
                .buildName(Itemname)
                .buildSize(size)
                .buildType(type)
                .build();
    }
    public static Hair updategetHair(String ItemNumber,String Itemname,String type,String size,String gender,String decription,String color){
        return new Hair.Builder(Igenerator.getSuffixFromClassName(HairFactory.class))
                .buildColor(color)
                .buildDescription(decription)
                .buildGender(gender)
                .buildName(Itemname)
                .buildSize(size)
                .buildType(type)
                .build();
    }
}