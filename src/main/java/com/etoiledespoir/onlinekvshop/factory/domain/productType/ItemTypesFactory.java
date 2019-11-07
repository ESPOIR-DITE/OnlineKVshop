package com.etoiledespoir.onlinekvshop.factory.domain.productType;

import com.etoiledespoir.onlinekvshop.domain.itemType.ItemType;
import com.etoiledespoir.onlinekvshop.domain.itemType.Types;

public class ItemTypesFactory {
    public static ItemType getItemTypes(String itemId, String typeId){
        return new ItemType.Builder(itemId).buildTypeId(typeId).build();
    }
}
