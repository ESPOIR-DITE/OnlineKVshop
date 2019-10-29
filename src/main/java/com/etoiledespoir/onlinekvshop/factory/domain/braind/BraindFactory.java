package com.etoiledespoir.onlinekvshop.factory.domain.braind;

import com.etoiledespoir.onlinekvshop.domain.braind.Braind;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class BraindFactory {
    public static Braind getBraind(String braindId,String braind){
        return new Braind.Builder(Igenerator.getSuffixFromClassName(BraindFactory.class))
                .buidBraind(braind)
                .build();
    }
}
