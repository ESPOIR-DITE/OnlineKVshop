package com.etoiledespoir.onlinekvshop.service.customerService.impl;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.repository.CustomerRepo.Icustomer;
import com.etoiledespoir.onlinekvshop.service.customerService.IcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements IcustomerService {
    private static CustomerService custServ=null;
    //private CustomerRepository custRep= CustomerRepoFactory.getCustomerRep();
@Autowired
    Icustomer custRep;
    private  CustomerService() {
    }
    public static CustomerService getCustServ()
    {
        if(custServ==null){
            custServ=new CustomerService();
        }return custServ;
    }

    @Override
    public Customer creat(Customer customer) {
        return custRep.save(customer);
    }

    @Override
    public Customer delete(String id) {
        Optional<Customer> mycustomer=custRep.findById(id);
        if(mycustomer!=null){
            custRep.deleteById(id);
        }
        return mycustomer.orElse(null);
    }

    @Override
    public Customer Update(Customer customer) {
        Optional<Customer> mycustomer=custRep.findById(customer.getId());
        if(mycustomer!=null){
            custRep.save(customer);
        }
        return mycustomer.orElse(null);
    }

    @Override
    public Customer read(String id) {
        Optional<Customer> mycustomer=custRep.findById(id);
        if(mycustomer!=null){
            custRep.findById(id);
        }
        return mycustomer.orElse(null);
    }

    @Override
    public List<Customer> readAll() {
        return custRep.findAll();
    }

}
