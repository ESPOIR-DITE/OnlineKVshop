package com.etoiledespoir.onlinekvshop.factory;

import com.etoiledespoir.onlinekvshop.domain.Customer;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import org.junit.Before;
import org.junit.Test;

public class CustomerFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void buildCustomer() {
        Customer customer= CustomerFactory.buildCustomer("espoir",3902,"espoire@djfddm","skjdfdfsd","parow","ready");
        System.out.println(customer.toString());
    }
}