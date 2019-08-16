package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Item;

public class ItemFactory {
    public static Item builItem(String ItemNumber,String name,String type){
        return new Item.Builder(ItemNumber)
                .buildName(name)
                .buildType(type)
                .build();
    }
}
