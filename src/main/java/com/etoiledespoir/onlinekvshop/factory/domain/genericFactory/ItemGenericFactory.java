package com.etoiledespoir.onlinekvshop.factory.domain.genericFactory;

import com.etoiledespoir.onlinekvshop.domain.item.ItemGeneric;

public class ItemGenericFactory {
    public static ItemGeneric getItemGeneric(double price,int quantity,String description,String ItemName,String marque,String itemType,String size,String color,String gender){
        return new ItemGeneric.Builder(price)
                .buildColor(color)
                .buildDescription(description)
                .buildGender(gender)
                .buildItemType(itemType)
                .buildMarque(marque)
                .buildName(ItemName)
                .buildQuantity(quantity)
                .buildSize(size)
                .build();
    }
}
