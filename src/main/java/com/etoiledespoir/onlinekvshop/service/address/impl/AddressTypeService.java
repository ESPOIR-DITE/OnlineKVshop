package com.etoiledespoir.onlinekvshop.service.address.impl;

import com.etoiledespoir.onlinekvshop.domain.users.address.AddressType;
import com.etoiledespoir.onlinekvshop.repository.user.address.impl.AddressTypeRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AddressTypeService implements Iservice<AddressType,String> {
    private static AddressTypeService addressTypeService;
    @Autowired
    AddressTypeRep addressTypeRep;

    private AddressTypeService() {
    }
    public static AddressTypeService getAddressTypeService(){
        if(addressTypeService==null){
            addressTypeService=new AddressTypeService();
        }return addressTypeService;
    }

    @Override
    public AddressType creat(AddressType addressType) {
        return addressTypeRep.save(addressType);
    }

    @Override
    public AddressType delete(String id) {
        Optional<AddressType> result=addressTypeRep.findById(id);
        addressTypeRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public AddressType Update(AddressType addressType) {
        return addressTypeRep.save(addressType);
    }

    @Override
    public AddressType read(String id) {
        Optional<AddressType> result=addressTypeRep.findById(id);
        return result.orElse(null);
    }
    public AddressType readWithAddressType(String type){
        for(AddressType addressType:readAll()){
            if(addressType.getAddressType().equals(type)){
                return addressType;
            }
        }
        return null;
    }

    @Override
    public List<AddressType> readAll() {
        return addressTypeRep.findAll();
    }
}
