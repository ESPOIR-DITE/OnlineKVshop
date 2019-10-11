package com.etoiledespoir.onlinekvshop.repository.user.userType.AdminRepo;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminIntTest {
@Autowired
AdminInt adminInt;
Admin admin= AdminFactory.buildAdmin("espoit","ditekemena","@espoir");
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void create(){
        Admin result=adminInt.save(admin);
        System.out.println(result);
    }
}