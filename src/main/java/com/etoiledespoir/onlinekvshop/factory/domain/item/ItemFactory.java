package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.Items;

public class ItemFactory {
    public static Items getItems(String ItemNumber,double price,int quantity,String description){
        return new Items.Builder(ItemNumber)
                .buildPrice(price)
                .buildQuantity(quantity)
                .Description(description)
                .build();

    }

}
