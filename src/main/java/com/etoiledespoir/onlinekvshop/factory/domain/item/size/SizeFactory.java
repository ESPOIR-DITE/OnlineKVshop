package com.etoiledespoir.onlinekvshop.factory.domain.item.size;

import com.etoiledespoir.onlinekvshop.domain.item.size.Size;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class SizeFactory {
    public static Size getSize(String size){
        return new Size.Builder(Igenerator.getSuffixFromClassName(SizeFactory.class)).buildSize(size).build();
    }
}
