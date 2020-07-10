package com.etoiledespoir.onlinekvshop.service.user.address;

import com.etoiledespoir.onlinekvshop.domain.user.address.UserAddress;
import com.etoiledespoir.onlinekvshop.repository.user.address.AddressRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserAddressService implements Iservice<UserAddress,String> {
    @Autowired
    AddressRep addressRep;
    private static UserAddressService userAddressService;

    private UserAddressService() {
    }
    public static UserAddressService getUserAddressService(){
        if(userAddressService ==null){
            userAddressService =new UserAddressService();
        }return userAddressService;
    }

    @Override
    public UserAddress creat(UserAddress address) {
        return addressRep.save(address);
    }

    @Override
    public UserAddress delete(String id) {
        UserAddress myAddress=read(id);
        if(myAddress!=null){
            delete(myAddress.getUserId());
            return myAddress;
        }
        return null;
    }

    @Override
    public UserAddress Update(UserAddress address) {
        UserAddress myAddress=read(address.getUserId());
        if(myAddress!=null){
            delete(address.getUserId());
            return addressRep.save(address);
        }
        return null;
    }

    @Override
    public UserAddress read(String id) {
        return get(id);
    }
    public UserAddress get(String id){
        Optional<UserAddress> result=addressRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<UserAddress> readAll() {
        return addressRep.findAll();
    }
}
