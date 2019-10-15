package com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader;

import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelper;

import java.io.File;

public class MyPicHelperFactory {
    public static MypicHelper getMypicHelper(String itemId,File image,String description){
        return new MypicHelper.Builder(itemId)
                .buildDescription(description)
                .buildImage(image)
                .build();
    }
}
