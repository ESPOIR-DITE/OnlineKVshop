package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminFactoryTest {
Admin admin;
    @Before
    public void setUp() throws Exception {
        admin=AdminFactory.buildAdmin("espoir","diteekemena","espoirditekemena@gmail.com");
    }

    @Test
    public void buildAdmin() {
        System.out.println(admin.toString());
    }
}