package com.etoiledespoir.onlinekvshop.factory.domain.user.address;

import com.etoiledespoir.onlinekvshop.domain.user.address.AddressType;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AddressTypeFact {
    public static AddressType getAddresType(String addresType){
        return new AddressType.Builder(Igenerator.getSuffixFromClassName(AddressTypeFact.class)).buildType(addresType).build();
    }
}
