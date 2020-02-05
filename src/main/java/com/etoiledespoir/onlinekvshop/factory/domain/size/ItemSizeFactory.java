package com.etoiledespoir.onlinekvshop.factory.domain.size;

import com.etoiledespoir.onlinekvshop.domain.size.ProductSize;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemSizeFactory {
    public static ProductSize getProductSize(String sizeId,String productId){
        return new ProductSize.Builder(Igenerator.getSuffixFromClassName(ItemSizeFactory.class)).buildItemId(productId).buildSizeId(sizeId).build();
    }
}
