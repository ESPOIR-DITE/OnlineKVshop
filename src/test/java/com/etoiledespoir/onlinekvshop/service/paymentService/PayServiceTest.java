package com.etoiledespoir.onlinekvshop.service.paymentService;

import com.etoiledespoir.onlinekvshop.domain.Payment;
import com.etoiledespoir.onlinekvshop.factory.domain.PaymentFactory;
import com.etoiledespoir.onlinekvshop.factory.service.PaymentServiceFac;
import com.etoiledespoir.onlinekvshop.service.paymentService.impl.PayService;
import org.junit.Before;
import org.junit.Test;

public class PayServiceTest {
    private PayService payService= PaymentServiceFac.getPayService();
    Payment payment= PaymentFactory.getPayment("93939393","espoir",3949,232432);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getPayService() {
    }

    @Test
    public void creat() {
        System.out.println(payService.creat(payment).toString());
    }

    @Test
    public void delete() {
        System.out.println(payService.delete("1003").toString());
    }

    @Test
    public void update() {
    }

    @Test
    public void read() {
    }

    @Test
    public void readAll() {
    }

    @Test
    public void getPremier() {
    }
}