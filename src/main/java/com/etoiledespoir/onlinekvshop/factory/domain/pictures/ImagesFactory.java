package com.etoiledespoir.onlinekvshop.factory.domain.pictures;

import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ImagesFactory {
    public static Images getImages( byte[] image){
        return new Images.Builder(Igenerator.getSuffixFromClassName(ImagesFactory.class)).buildImage(image).build();
    }
}
