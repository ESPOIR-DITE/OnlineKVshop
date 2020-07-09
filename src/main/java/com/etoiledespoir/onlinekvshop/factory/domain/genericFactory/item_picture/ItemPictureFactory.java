package com.etoiledespoir.onlinekvshop.factory.domain.genericFactory.item_picture;

import com.etoiledespoir.onlinekvshop.domain.generic.item_picture.itemImage;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemPictureFactory {
    public static itemImage getItem_picture(String itemId, String imageId) {
        return new itemImage.Builder(itemId).buildId(Igenerator.getSuffixFromClassName(ItemPictureFactory.class)).buildImageId(imageId).build();
    }
}
