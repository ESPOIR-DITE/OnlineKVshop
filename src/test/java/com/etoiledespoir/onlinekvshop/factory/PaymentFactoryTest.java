package com.etoiledespoir.onlinekvshop.factory;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.domain.Payment;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.PaymentFactory;
import org.junit.Before;
import org.junit.Test;

public class PaymentFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getPayment() {
        Customer customer= CustomerFactory.buildCustomer("espoir",48484,"espeior@gnsmdf","paeweor","Av lubo","sjddhfh");
        Payment payment= PaymentFactory.getPayment("93939393","cash",3949,232432);
        System.out.println(payment.toString());
    }
}