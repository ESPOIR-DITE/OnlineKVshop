package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.util.Igenerator;
import org.hibernate.mapping.IdGenerator;

public class BeautyFactory {
    public static BeautyMakeup getBeauty(String ItemName,String marque,String size,String decription,double price,int quantity){
        return new BeautyMakeup.Builder(Igenerator.getSuffixFromClassName(BeautyMakeup.class))
                .buildDescription(decription)
                .buildMarque(marque)
                .buildName(ItemName)
                .buildPrice(price)
                .buildQuantity(quantity)
                .buildSize(size)
                .build();
    }
}
