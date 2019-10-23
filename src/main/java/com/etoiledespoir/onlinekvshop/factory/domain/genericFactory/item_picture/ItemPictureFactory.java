package com.etoiledespoir.onlinekvshop.factory.domain.genericFactory.item_picture;

import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;

public class ItemPictureFactory {
    public static Item_Pictures getItem_picture( String itemId,String imageId){
        return new Item_Pictures.Builder(itemId).buildImageId(imageId).build();
    }
}
