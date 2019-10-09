package com.etoiledespoir.onlinekvshop.factory.domain.bridge;

import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;

public class CustomerBridgeFactory {
    public CustomerBridge getCustomerBridge(String id, String email,String addressId,String genderId){
        return new CustomerBridge.Builder(id)
                .buildEmail(email)
                .buildAddressId(addressId)
                .buildGenderId(genderId)
                .build();
    }
}
