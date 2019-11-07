package com.etoiledespoir.onlinekvshop.factory.domain.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ProductType;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ProductTypeFactory {
    public static ProductType getProductType(String productId, String typeId){
        return new ProductType.Builder(productId)
                .buildType(typeId).build();
    }
}
