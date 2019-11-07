package com.etoiledespoir.onlinekvshop.factory.domain.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.AddressType;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AddressTypeFact {
    public static AddressType getAddresType(String addresType){
        return new AddressType.Builder(Igenerator.getSuffixFromClassName(AddressTypeFact.class)).buildType(addresType).build();
    }
}
