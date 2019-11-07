package com.etoiledespoir.onlinekvshop.factory.domain.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ProductFactory {
    public static Products getProduct(String name,String desc){
        return new Products.Builder(Igenerator.getSuffixFromClassName(ProductFactory.class))
                .buildDescription(desc)
                .buildName(name)
                .build();
    }
    public static Products updateProduct(String id,String name,String desc){
        return new Products.Builder(id)
                .buildDescription(desc)
                .buildName(name)
                .build();
    }
}
