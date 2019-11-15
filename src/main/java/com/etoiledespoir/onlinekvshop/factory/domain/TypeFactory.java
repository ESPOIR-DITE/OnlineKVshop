package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.itemType.Types;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class TypeFactory {
    public static Types getTypes(String type){
        return new Types.Builder(Igenerator.getSuffixFromClassName(TypeFactory.class)).buildType(type).build();
    }
}
