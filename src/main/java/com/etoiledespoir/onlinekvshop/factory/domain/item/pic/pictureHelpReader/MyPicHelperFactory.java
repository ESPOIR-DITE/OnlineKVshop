package com.etoiledespoir.onlinekvshop.factory.domain.item.pic.pictureHelpReader;

import com.etoiledespoir.onlinekvshop.domain.item.pic.picHelper.MypicHelper;

import java.io.File;

public class MyPicHelperFactory {
    public static MypicHelper getMypicHelper(String itemId,File image,String description){
        return new MypicHelper.Builder(itemId)
                .buildDescription(description)
                .buildImage(image)
                .build();
    }
}
