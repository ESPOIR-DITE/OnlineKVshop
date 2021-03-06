package com.etoiledespoir.onlinekvshop.factory.domain.item.pictures;

import com.etoiledespoir.onlinekvshop.domain.item.image.Images;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ImagesFactory {
    public static Images getImages( byte[] image){
        return new Images.Builder(Igenerator.getSuffixFromClassName(ImagesFactory.class)).buildImage(image).build();
    }
    public static Images updateImages( String id,byte[] image){
        return new Images.Builder(id).buildImage(image).build();
    }
}
