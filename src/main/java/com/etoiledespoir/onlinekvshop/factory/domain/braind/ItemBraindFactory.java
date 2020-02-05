package com.etoiledespoir.onlinekvshop.factory.domain.braind;

import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ItemBraindFactory {
    public static ItemBraind getItemBraind( String braindId,String itemId){
        return new ItemBraind.Builder(Igenerator.getSuffixFromClassName(ItemBraindFactory.class))
                .buildBrainfId(braindId)
                .buildItemId(itemId)
                .build();
    }
}
