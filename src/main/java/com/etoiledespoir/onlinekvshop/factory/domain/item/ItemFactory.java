package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.item.Items;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemFactory {
    public static Items getItems(String name,String description){
        return new Items.Builder(Igenerator.getSuffixFromClassName(ItemFactory.class))
                .buildName(name)
                .Description(description)
                .build();

    }

}
