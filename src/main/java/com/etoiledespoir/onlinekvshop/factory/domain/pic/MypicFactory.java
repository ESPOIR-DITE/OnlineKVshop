package com.etoiledespoir.onlinekvshop.factory.domain.pic;

import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

import java.io.File;

public class MypicFactory {
    public static Mypic getMypic(String itemId, File image){
        return new Mypic.Builder(Igenerator.getSuffixFromClassName(MypicFactory.class))
                .buildImage(image)
                .buildItemId(itemId)
                .build();
    }
}
