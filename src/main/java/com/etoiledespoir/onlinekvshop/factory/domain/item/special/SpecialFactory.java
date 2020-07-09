package com.etoiledespoir.onlinekvshop.factory.domain.item.special;

import com.etoiledespoir.onlinekvshop.domain.item.specials.ItemSpecial;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class SpecialFactory {
    public static ItemSpecial getItemSpecial(String endPeriod,String title,String itemId,String period,String description,double previousePrice,double actualPrice){
        return new ItemSpecial.Builder(Igenerator.getSuffixFromClassName(SpecialFactory.class))
                .buildAcrualPrice(actualPrice)
                .buildDescription(description)
                .buildEndPeriod(endPeriod)
                .buildItemId(itemId)
                .buildPeriod(period)
                .buildPreviousPrice(previousePrice)
                .builTitle(title)
                .build();
    }
}
