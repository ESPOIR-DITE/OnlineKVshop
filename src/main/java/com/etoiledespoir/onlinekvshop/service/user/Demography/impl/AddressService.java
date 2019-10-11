package com.etoiledespoir.onlinekvshop.service.user.Demography.impl;

import com.etoiledespoir.onlinekvshop.domain.users.Demography.Address;
import com.etoiledespoir.onlinekvshop.repository.user.Demography.AddressRepository;
import com.etoiledespoir.onlinekvshop.service.user.Demography.AddressServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements AddressServiceInt {
    @Autowired
    AddressRepository addressRepository;
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
        return addressRepository.save(address);
    }

    @Override
    public Address delete(String id) {
        Optional<Address> result=addressRepository.findById(id);
        addressRepository.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Address Update(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address read(String id) {
        Optional<Address> result=addressRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Address> readAll() {
        return addressRepository.findAll();
    }
}
