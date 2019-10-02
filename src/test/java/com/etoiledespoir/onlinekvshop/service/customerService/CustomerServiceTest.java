package com.etoiledespoir.onlinekvshop.service.customerService;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import com.etoiledespoir.onlinekvshop.factory.repository.CustomerRepoFactory;
import com.etoiledespoir.onlinekvshop.factory.service.CustomerServFacto;
import com.etoiledespoir.onlinekvshop.repository.CustomerRepo.CustomerRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomerServiceTest {
    CustomerRepository customerRepository= CustomerRepoFactory.getCustomerRep();
    CustomerService customerService= CustomerServFacto.getCustser();
    Customer customer= CustomerFactory.buildCustomer("espoir",1004,"@","skjdfdfsd","parow","ready");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void creat() {
        System.out.println(customerService.creat(customer).toString());
    }

    @Test
    public void delete() {
        System.out.println(customerService.delete("1005").toString());
    }

    @Test
    public void update() {
        System.out.println(customerService.Update(customer).toString());
    }

    @Test
    public void read() {
        System.out.println(customerService.read("1004").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=customerService.readAll();
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }

    @Test
    public void getPremier() {
    }
}