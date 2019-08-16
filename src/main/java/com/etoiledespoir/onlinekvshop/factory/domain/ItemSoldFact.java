package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.ItemSold;

public class ItemSoldFact {
    public static ItemSold getItemS(int id,int itemId,int orderId){
        return new ItemSold.Builder(id)
                .buildItemIde(itemId)
                .buildOrder(orderId)
                .getItemSold();
    }
}
