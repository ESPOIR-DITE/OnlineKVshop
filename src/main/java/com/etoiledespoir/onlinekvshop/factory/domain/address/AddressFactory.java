package com.etoiledespoir.onlinekvshop.factory.domain.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.impl.Address;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AddressFactory {
    public static Address getAddress(String userId,String quartier){
        return new Address.Builder(userId)
                .buildAddress(quartier)
                .build();
    }
}
