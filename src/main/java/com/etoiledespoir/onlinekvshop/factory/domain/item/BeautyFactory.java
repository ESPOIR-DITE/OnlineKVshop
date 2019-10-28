package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class BeautyFactory {
    public static BeautyMakeup getBeauty(String size,String type){
        return new BeautyMakeup.Builder(Igenerator.getSuffixFromClassName(BeautyMakeup.class))
                .buildType(type)
                .buildSize(size)
                .build();
    }
    public static BeautyMakeup updateBeauty(String itemNumber,String size,String type){
        return new BeautyMakeup.Builder(itemNumber)
                .buildType(type)
                .buildSize(size)
                .build();
    }
}
