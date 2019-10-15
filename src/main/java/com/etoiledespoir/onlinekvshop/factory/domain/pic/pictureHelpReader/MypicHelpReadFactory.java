package com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader;

import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;

public class MypicHelpReadFactory {
    public static MypicHelpRead getMypicture(String id, String itemId, String image, String description) {
        return new MypicHelpRead.Builder(id)
                .buildDesc(description)
                .buildImage(image)
                .buildItemId(itemId)
                .build();
    }
}
