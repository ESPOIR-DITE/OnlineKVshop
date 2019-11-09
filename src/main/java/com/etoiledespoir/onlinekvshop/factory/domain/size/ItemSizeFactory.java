package com.etoiledespoir.onlinekvshop.factory.domain.size;

import com.etoiledespoir.onlinekvshop.domain.size.ProductSize;

public class ItemSizeFactory {
    public static ProductSize getProductSize(String sizeId,String productId){
        return new ProductSize.Builder(productId).buildSizeId(sizeId).build();
    }
}
