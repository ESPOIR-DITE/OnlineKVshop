package com.etoiledespoir.onlinekvshop.factory.domain.item.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ItemType;

public class ProductTypeFactory {
    public static ItemType getProductType(String productId, String typeId){
        return new ItemType.Builder(productId)
                .buildType(typeId).build();
    }
}
