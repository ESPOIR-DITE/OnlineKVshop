package com.etoiledespoir.onlinekvshop.factory.domain.item.type;

import com.etoiledespoir.onlinekvshop.domain.item.itemType.ItemType;

public class ItemTypesFactory {
    public static ItemType getItemTypes(String itemId, String typeId){
        return new ItemType.Builder(itemId).buildTypeId(typeId).build();
    }
}
