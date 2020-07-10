package com.etoiledespoir.onlinekvshop.factory.domain.item.braind;

import com.etoiledespoir.onlinekvshop.domain.item.braind.Brand;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class BraindFactory {
    public static Brand getBraind(String braind){
        return new Brand.Builder(Igenerator.getSuffixFromClassName(BraindFactory.class))
                .buidBraind(braind)
                .build();
    }
}
