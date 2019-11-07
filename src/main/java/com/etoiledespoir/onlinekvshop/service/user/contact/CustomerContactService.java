package com.etoiledespoir.onlinekvshop.service.user.contact;

import com.etoiledespoir.onlinekvshop.domain.users.contact.CustomerContact;
import com.etoiledespoir.onlinekvshop.repository.user.contact.CustomerContactRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerContactService implements Iservice<CustomerContact,String> {
    @Autowired
    private CustomerContactRep customerContactRep;
    private static CustomerContactService customerContactService;

    private CustomerContactService() {
    }
    public static CustomerContactService getCustomerContactService(){
        if(customerContactService==null){
            customerContactService=new CustomerContactService();
        }return customerContactService;
    }

    @Override
    public CustomerContact creat(CustomerContact customerContact) {
        return customerContactRep.save(customerContact);
    }

    @Override
    public CustomerContact delete(String id) {
        Optional<CustomerContact> result=customerContactRep.findById(id);
        customerContactRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public CustomerContact Update(CustomerContact customerContact) {
        return customerContactRep.save(customerContact);
    }

    @Override
    public CustomerContact read(String id) {
        Optional<CustomerContact> result=customerContactRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<CustomerContact> readAll() {
        return customerContactRep.findAll();
    }
}
