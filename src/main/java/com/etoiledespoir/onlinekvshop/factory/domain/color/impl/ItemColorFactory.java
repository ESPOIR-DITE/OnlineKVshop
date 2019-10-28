package com.etoiledespoir.onlinekvshop.factory.domain.color.impl;

import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;

public class ItemColorFactory {
    public static ItemColor getItemColer(String itemId,String colorId){
        return new ItemColor.Builder(itemId).buildColer(colorId).build();
    }
}
