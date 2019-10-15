package com.etoiledespoir.onlinekvshop.factory.domain.pic;

import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

import java.io.File;

public class MypicFactory {
    public static Mypic getMypic(String itemId,String descriptioon){
        return new Mypic.Builder(Igenerator.getSuffixFromClassName(MypicFactory.class))
                .buildItemId(itemId)
                .buildDesc(descriptioon)
                .build();
    }
}
