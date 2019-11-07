package com.etoiledespoir.onlinekvshop.factory.domain.productType;

import com.etoiledespoir.onlinekvshop.domain.itemType.ItemType;
import com.etoiledespoir.onlinekvshop.domain.itemType.Types;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class TypeFactory {
    public static Types getType(String type){
        return new Types.Builder(Igenerator.getSuffixFromClassName(Types.class)).buildType(type).build();
    }
}
