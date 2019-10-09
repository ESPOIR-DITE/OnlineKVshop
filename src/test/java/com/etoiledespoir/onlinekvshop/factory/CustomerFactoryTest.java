package com.etoiledespoir.onlinekvshop.factory;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import org.junit.Before;
import org.junit.Test;

public class CustomerFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void buildCustomer() {
        Customer customer= CustomerFactory.getCustomer("espoir","espoire@djfddm","skjdfdfsd","parow");
        System.out.println(customer.toString());
    }
}