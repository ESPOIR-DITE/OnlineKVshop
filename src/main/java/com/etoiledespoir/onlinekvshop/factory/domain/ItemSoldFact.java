package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.itemSold.ItemSold;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemSoldFact {
    public static ItemSold getItemS(String itemId,String orderId){
        return new ItemSold.Builder(Igenerator.getSuffixFromClassName(ItemSoldFact.class))
                .buildItemIde(itemId)
                .buildOrder(orderId)
                .getItemSold();
    }
    public static ItemSold updateItemS(String id,String itemId,String orderId){
        return new ItemSold.Builder(id)
                .buildItemIde(itemId)
                .buildOrder(orderId)
                .getItemSold();
    }
}

