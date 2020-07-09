package com.etoiledespoir.onlinekvshop.factory.domain.user.bridge;



public class CustomerBridgeFactory{}/** {
    public static CustomerBridge getCustomerBridge( String email,String addressId,String genderId){
        return new CustomerBridge.Builder(Igenerator.getSuffixFromClassName(CustomerBridgeFactory.class))
                .buildEmail(email)
                .buildAddressId(addressId)
                .buildGenderId(genderId)
                .build();
    }
    public static CustomerBridge updateCustomerBridge( String id,String email,String addressId,String genderId){
        return new CustomerBridge.Builder(id)
                .buildEmail(email)
                .buildAddressId(addressId)
                .buildGenderId(genderId)
                .build();
    }
}
*/