package com.etoiledespoir.onlinekvshop.repository.AdminRepo;

import com.etoiledespoir.onlinekvshop.domain.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;
import com.etoiledespoir.onlinekvshop.factory.repository.AdminRepoFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdminRepositoryTest {
    Admin admin = AdminFactory.buildAdmin("espoir",1001,"espooie","203838");
    AdminRepository adminRep=AdminRepository.getAdm();


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAdm() {
       // Assert.assertNotNull(adminRep);
        System.out.println(adminRep.creat(admin));
    }

    @Test
    public void creat() {

    }

    @Test
    public void delete() {
        System.out.println(adminRep.delete("1000").toString());
    }

    @Test
    public void update() {
        System.out.println(adminRep.Update(admin));
    }

    @Test
    public void read() {
        System.out.println(adminRep.read("1001"));
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=adminRep.readAll();

        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
        }
    }

    @Test
    public void getPremier() {
    }
}