package com.etoiledespoir.onlinekvshop.factory.domain.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.impl.Address;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AddressFactory {
    public static Address getAddress(String commun,String quartier,String avenue,int numero){
        return new Address.Builder(Igenerator.getSuffixFromClassName(AddressFactory.class))
                .buildAvenue(avenue)
                .buildCommune(commun)
                .buildNumbero(numero)
                .buildQuartier(quartier)
                .build();
    }
}
