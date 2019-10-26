package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.Items;

public class ItemFactory {
    public static Items getItems(String ItemNumber,String name,String type,String description){
        return new Items.Builder(ItemNumber)
                .buildName(name)
                .buildType(type)
                .Description(description)
                .build();

    }

}
