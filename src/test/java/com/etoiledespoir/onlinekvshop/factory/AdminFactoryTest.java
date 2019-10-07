package com.etoiledespoir.onlinekvshop.factory;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;
import org.junit.Before;
import org.junit.Test;

public class AdminFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void buildAdmin() {
        Admin admin= AdminFactory.buildAdmin("espoir","ditekemena","jsdfhjshue");
        System.out.println(admin.toString());
    }
}