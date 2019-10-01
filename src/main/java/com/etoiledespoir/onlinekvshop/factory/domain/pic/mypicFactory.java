package com.etoiledespoir.onlinekvshop.factory.domain.pic;

import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;

public class mypicFactory {
    public static Mypic getMypic(String id, byte[] image){
        return new Mypic.Builder(id).buildImage(image).build();
    }
}
