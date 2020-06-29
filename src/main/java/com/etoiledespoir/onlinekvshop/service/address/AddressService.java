package com.etoiledespoir.onlinekvshop.service.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.impl.Address;
import com.etoiledespoir.onlinekvshop.repository.user.address.AddressRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AddressService implements Iservice<Address,String> {
    @Autowired
    AddressRep addressRep;
    private static AddressService addressService;

    private AddressService() {
    }
    public static AddressService getAddressService(){
        if(addressService==null){
            addressService=new AddressService();
        }return addressService;
    }

    @Override
    public Address creat(Address address) {
        return addressRep.save(address);
    }

    @Override
    public Address delete(String id) {
        Optional<Address> result=addressRep.findById(id);
        addressRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Address Update(Address address) {
        Address myAddress=read(address.getUserId());
        if(myAddress!=null){
            delete(address.getUserId());
            return addressRep.save(address);
        }
        return null;
    }

    @Override
    public Address read(String id) {
        Optional<Address> result=addressRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Address> readAll() {
        return addressRep.findAll();
    }
}
