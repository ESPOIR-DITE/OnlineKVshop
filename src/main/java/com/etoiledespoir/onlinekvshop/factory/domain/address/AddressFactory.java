package com.etoiledespoir.onlinekvshop.factory.domain.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.impl.Address;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AddressFactory {
    public static Address getAddress(String userId,String address,String addressTypeId,String phoneNumber){
        return new Address.Builder(userId).buildAddressTypeId(addressTypeId).buildAddress(address).buildPhoneNumber(phoneNumber)
                .build();
    }
}
