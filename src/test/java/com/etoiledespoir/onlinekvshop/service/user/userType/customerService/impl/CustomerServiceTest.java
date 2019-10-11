package com.etoiledespoir.onlinekvshop.service.user.userType.customerService.impl;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import com.etoiledespoir.onlinekvshop.factory.service.CustomerServFacto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceTest {
    @Autowired
    CustomerService customerService;

private Customer customer= CustomerFactory.getCustomer("@esir.com","espoir","activ","ditemejek");
    @Test
    public void creat() {
       // Customer customer1=customerService.creat(customer);
       // System.out.println(customer1.toString());
        CustomerService custserv=CustomerServFacto.getCustomerservice();

        System.out.println(custserv.creat(customer).toString());
        //Assert.assertNotNull(customerService.name);
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void read() {
        CustomerService custserv=CustomerServFacto.getCustomerservice();
        //Customer customer1=customerService.read("espoir@com");
        System.out.println(custserv.read("espoir@com").toString());

    }

    @Test
    public void readAll() {
        for(Customer customer:customerService.readAll()){
            System.out.println(customer.toString());
        }
    }
}