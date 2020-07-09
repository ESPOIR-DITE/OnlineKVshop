package com.etoiledespoir.onlinekvshop.factory.domain.item.size;

import com.etoiledespoir.onlinekvshop.domain.item.size.ItemSize;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemSizeFactory {
    public static ItemSize getProductSize(String sizeId, String productId){
        return new ItemSize.Builder(Igenerator.getSuffixFromClassName(ItemSizeFactory.class)).buildItemId(productId).buildSizeId(sizeId).build();
    }
}
