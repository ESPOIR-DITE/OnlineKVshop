package com.etoiledespoir.onlinekvshop.service.bridge.impl;

import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;
import com.etoiledespoir.onlinekvshop.repository.bridge.CustomerBridgeRepInt;
import com.etoiledespoir.onlinekvshop.service.bridge.CustomerBridgeServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerBridgeService implements CustomerBridgeServiceInt {
    @Autowired
    CustomerBridgeRepInt customerBridgeRep;
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
        return customerBridgeRep.save(customerBridge);
    }

    @Override
    public CustomerBridge delete(String id) {
        List<CustomerBridge> result=customerBridgeRep.findAll();
        for(CustomerBridge cb: result){
            if(cb.getEmail().equals(id)){
               return  cb;
            }

        }
        return null;
    }

    @Override
    public CustomerBridge Update(CustomerBridge customerBridge) {
        return customerBridgeRep.save(customerBridge);
    }

    @Override
    public CustomerBridge read(String id) {
        Optional<CustomerBridge> result=customerBridgeRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<CustomerBridge> readAll() {
        return customerBridgeRep.findAll();
    }
}
