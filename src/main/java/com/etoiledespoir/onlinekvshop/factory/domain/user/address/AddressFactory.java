package com.etoiledespoir.onlinekvshop.factory.domain.user.address;

import com.etoiledespoir.onlinekvshop.domain.user.address.UserAddress;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AddressFactory {
    public static UserAddress getAddress(String userId,String address,String addressTypeId,String phoneNumber){
        return new UserAddress.Builder(Igenerator.getSuffixFromClassName(AddressFactory.class))
                .buildAddressTypeId(addressTypeId)
                .buildAddress(address)
                .buildUserId(userId)
                .buildPhone(phoneNumber)
                .build();
    }
}
