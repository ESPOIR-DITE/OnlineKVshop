package com.etoiledespoir.onlinekvshop.service.customerService.impl;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import com.etoiledespoir.onlinekvshop.repository.CustomerRepo.Icustomer;
import com.etoiledespoir.onlinekvshop.repository.CustomerRepo.impl.CustomerRepository;
import com.etoiledespoir.onlinekvshop.service.customerService.IcustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements IcustomerService {
    private static CustomerService custServ=null;
    String name="espoir";

    Customer customerx= CustomerFactory.getCustomer("@espoir.com","espoir","activ","ditemejek");
@Autowired
    Icustomer custRep;
    private  CustomerService() {
    }
    public static CustomerService getCustServ(){
        if(custServ==null){
            custServ=new CustomerService();
        }return custServ;
    }
public String getName()
{
    return name;
}
    @Override
    public Customer creat(Customer customer) {
        System.out.println(customer.toString());
        custRep.save(customer);
        Customer result=custRep.findByEmail(customer.getEmail());
        System.out.println(result.toString()+" in customer");
        //return custRep.save(customerx);
        return null;
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
    public Customer read(String email) {
        System.out.println(email);
        Optional<Customer> mycustomer=custRep.findById(email);
        if(mycustomer!=null){
            custRep.findById(email);
        }
        return mycustomer.orElse(null);
    }

    @Override
    public List<Customer> readAll() {
        return custRep.findAll();
    }

}
