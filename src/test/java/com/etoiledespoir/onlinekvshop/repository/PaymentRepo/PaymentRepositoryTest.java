package com.etoiledespoir.onlinekvshop.repository.PaymentRepo;

import com.etoiledespoir.onlinekvshop.domain.Payment;
import com.etoiledespoir.onlinekvshop.factory.domain.PaymentFactory;
import com.etoiledespoir.onlinekvshop.factory.repository.PaymentRepFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PaymentRepositoryTest {

    private PaymentRepository pr= PaymentRepFactory.getPayRep();
    Payment payment= PaymentFactory.getPayment("93939393","espoir",3949,232432);
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getPaym() {
        Assert.assertNotNull(payment);

    }

    @Test
    public void creat() {
        System.out.println(pr.creat(payment).toString());
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void read() {
        System.out.println(pr.read("1001").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=pr.readAll();
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }

    @Test
    public void getPremier() {
    }
}