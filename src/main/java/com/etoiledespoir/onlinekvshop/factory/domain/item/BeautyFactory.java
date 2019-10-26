package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class BeautyFactory {
    public static BeautyMakeup getBeauty(String size,String decription){
        return new BeautyMakeup.Builder(Igenerator.getSuffixFromClassName(BeautyMakeup.class))
                .buildDescription(decription)
                .buildSize(size)
                .build();
    }
    public static BeautyMakeup updateBeauty(String itemNumber,String ItemName,String marque,String size,String decription,String color,String itemType){
        return new BeautyMakeup.Builder(itemNumber)
                .buildDescription(decription)
                .buildSize(size)
                .build();
    }
}
