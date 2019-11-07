package com.etoiledespoir.onlinekvshop.factory.domain.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.impl.Address;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AddressFactory {
    public static Address getAddress(String userId,String addressTypeId,String commun,String quartier,String avenue,int numero){
        return new Address.Builder(userId)
                .buildAvenue(avenue)
                .buildCommune(commun)
                .buildNumbero(numero)
                .buildQuartier(quartier)
                .buildAddressType(addressTypeId)
                .build();
    }
}
