package com.etoiledespoir.onlinekvshop.service.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.bridge.CustomerGender;
import com.etoiledespoir.onlinekvshop.repository.gender.CustomerGenderRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustGenderService implements Iservice<CustomerGender,String> {
    @Autowired
    CustomerGenderRep customerGenderRep;
    private static CustGenderService custGenderService;

    private CustGenderService() {
    }
    public static CustGenderService getCustGenderService(){
        if(custGenderService==null){
            custGenderService=new CustGenderService();
        }return custGenderService;
    }

    @Override
    public CustomerGender creat(CustomerGender customerGender) {
        return customerGenderRep.save(customerGender);
    }

    @Override
    public CustomerGender delete(String id) {
        Optional<CustomerGender> result=customerGenderRep.findById(id);
        customerGenderRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public CustomerGender Update(CustomerGender customerGender) {
        return customerGenderRep.save(customerGender);
    }

    @Override
    public CustomerGender read(String id) {
        Optional<CustomerGender> result=customerGenderRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<CustomerGender> readAll() {
        return customerGenderRep.findAll();
    }
}
