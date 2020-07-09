package com.etoiledespoir.onlinekvshop.factory.domain.user;

import com.etoiledespoir.onlinekvshop.domain.item.itemType.TypeOfItem;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class TypeFactory {
    public static TypeOfItem getTypes(String type){
        return new TypeOfItem.Builder(Igenerator.getSuffixFromClassName(TypeFactory.class)).buildType(type).build();
    }
}
