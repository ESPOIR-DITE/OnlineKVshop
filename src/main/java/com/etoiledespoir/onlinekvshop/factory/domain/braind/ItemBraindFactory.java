package com.etoiledespoir.onlinekvshop.factory.domain.braind;

import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;

public class ItemBraindFactory {
    public static ItemBraind getItemBraind( String braindId,String itemId){
        return new ItemBraind.Builder(braindId)
                .buildItemId(itemId)
                .build();
    }
}
