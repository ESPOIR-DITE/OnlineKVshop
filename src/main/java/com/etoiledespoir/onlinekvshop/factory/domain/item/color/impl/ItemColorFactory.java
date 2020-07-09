package com.etoiledespoir.onlinekvshop.factory.domain.item.color.impl;

import com.etoiledespoir.onlinekvshop.domain.item.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemColorFactory {
    public static ItemColor getItemColer(String itemId,String colorId){
        return new ItemColor.Builder(Igenerator.getSuffixFromClassName(ItemColor.class)).buildItemId(itemId).buildColer(colorId).build();
    }
}
