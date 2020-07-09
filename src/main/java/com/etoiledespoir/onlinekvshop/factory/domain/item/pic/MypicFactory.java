package com.etoiledespoir.onlinekvshop.factory.domain.item.pic;

import com.etoiledespoir.onlinekvshop.domain.item.pic.Mypic;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class MypicFactory {
    public static Mypic getMypic(String itemId,String descriptioon){
        return new Mypic.Builder(Igenerator.getSuffixFromClassName(MypicFactory.class))
                .buildItemId(itemId)
                .buildDesc(descriptioon)
                .build();
    }
}
