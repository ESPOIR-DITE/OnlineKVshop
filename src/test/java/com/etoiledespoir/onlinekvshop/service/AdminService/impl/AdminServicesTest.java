package com.etoiledespoir.onlinekvshop.service.AdminService.impl;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;
import com.etoiledespoir.onlinekvshop.factory.service.AdminServiceFact;
import org.junit.Assert;
import org.junit.Test;

public class AdminServicesTest {

    @Test
    public void creat() {
        Admin admin= AdminFactory.buildAdmin("espoir","ditemena","espoirdDitekem@gmail.com");
        AdminServices adminServices= AdminServiceFact.getAdminService();
        System.out.println(admin.toString());
        Admin result=adminServices.creat(admin);
        Assert.assertNotNull(result);
    }

    @Test
    public void delete() {
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
}