package com.etoiledespoir.onlinekvshop.service.customerService;

import com.etoiledespoir.onlinekvshop.domain.Customer;
import com.etoiledespoir.onlinekvshop.factory.repository.CustomerRepoFactory;
import com.etoiledespoir.onlinekvshop.repository.CustomerRepo.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService implements IcustomerService {
    private static CustomerService custServ=null;
    private CustomerRepository custRep= CustomerRepoFactory.getCustomerRep();

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
        return this.custRep.creat(customer);
    }

    @Override
    public Customer delete(String id) {
        return this.custRep.delete(id);
    }

    @Override
    public Customer Update(Customer customer) {
        return custRep.Update(customer);
    }

    @Override
    public Customer read(String id) {
        return custRep.read(id);
    }

    @Override
    public ArrayList<String> readAll() {
        return custRep.readAll();
    }

    @Override
    public String getPremier() {
        return null;
    }
}
