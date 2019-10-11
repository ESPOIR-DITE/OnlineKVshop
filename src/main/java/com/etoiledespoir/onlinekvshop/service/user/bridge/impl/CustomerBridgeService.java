package com.etoiledespoir.onlinekvshop.service.user.bridge.impl;

import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;
import com.etoiledespoir.onlinekvshop.repository.bridge.CustomerBridgeRepInt;
import com.etoiledespoir.onlinekvshop.service.user.bridge.CustomerBridgeServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerBridgeService implements CustomerBridgeServiceInt {
    @Autowired
    private CustomerBridgeRepInt customerBridgeRepInt;

    private static CustomerBridgeService cust;

    private CustomerBridgeService() {
    }
    public static CustomerBridgeService getCust(){
        if(cust==null){
            cust=new CustomerBridgeService();
        }return cust;
    }

    @Override
    public CustomerBridge creat(CustomerBridge customerBridge) {
        return customerBridgeRepInt.save(customerBridge);
    }

    @Override
    public CustomerBridge delete(String id) {
        Optional<CustomerBridge> resulr=customerBridgeRepInt.findById(id);
         customerBridgeRepInt.deleteById(id);
        return resulr.orElse(null);
    }

    @Override
    public CustomerBridge Update(CustomerBridge customerBridge) {
        return customerBridgeRepInt.save(customerBridge);
    }

    @Override
    public CustomerBridge read(String id) {
        Optional<CustomerBridge> resulr=customerBridgeRepInt.findById(id);

        return resulr.orElse(null);
    }

    @Override
    public List<CustomerBridge> readAll() {
        return customerBridgeRepInt.findAll();
    }

    public CustomerBridge readWithEmail(String email){
        List<CustomerBridge> result=customerBridgeRepInt.findAll();
        for(CustomerBridge customerBridge: result){
            if(customerBridge.getEmail().equals(email)){
                return customerBridge;
            }
        }
        return null;
    }
}
