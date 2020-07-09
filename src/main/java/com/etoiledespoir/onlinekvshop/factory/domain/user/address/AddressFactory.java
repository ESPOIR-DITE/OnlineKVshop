package com.etoiledespoir.onlinekvshop.factory.domain.user.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.Address;

public class AddressFactory {
    public static Address getAddress(String userId,String address,String addressTypeId,String phoneNumber){
        return new Address.Builder(userId).buildAddressTypeId(addressTypeId).buildAddress(address).buildPhoneNumber(phoneNumber)
                .build();
    }
}
