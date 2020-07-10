package com.etoiledespoir.onlinekvshop.factory.domain.item.braind;

import com.etoiledespoir.onlinekvshop.domain.item.braind.ItemBrand;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemBraindFactory {
    public static ItemBrand getItemBraind(String braindId, String itemId){
        return new ItemBrand.Builder(Igenerator.getSuffixFromClassName(ItemBraindFactory.class))
                .buildBrainfId(braindId)
                .buildItemId(itemId)
                .build();
    }
}
