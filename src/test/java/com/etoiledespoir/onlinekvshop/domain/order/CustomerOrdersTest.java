package com.etoiledespoir.onlinekvshop.domain.order;

import com.etoiledespoir.onlinekvshop.factory.domain.OrderFactory;
import org.junit.Before;
import org.junit.Test;

public class CustomerOrdersTest {

    CustomerOrders order= OrderFactory.getOrders("0000","432/qwereqwe");
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getDate() {
        System.out.println(order.toString());
    }

    @Test
    public void setDate() {
    }

    @Test
    public void getOrderNumber() {
    }

    @Test
    public void setOrderNumber() {
    }

    @Test
    public void getCustomer() {
    }

    @Test
    public void setCustomer() {
    }

    @Test
    public void toString1() {
    }
}