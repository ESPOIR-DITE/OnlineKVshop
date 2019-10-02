package com.etoiledespoir.onlinekvshop.controller.admin;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdminControllerTest {
    private static  final String Base_url="http://localhost:8080/OKVS/admin";
@Autowired
private TestRestTemplate restTemplate;
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void create() {
        Admin admin= AdminFactory.buildAdmin("espoir",234,"dite","admin");
        ResponseEntity responseEntity=restTemplate.withBasicAuth("admin","admin")
                .postForEntity(Base_url +"/creat",admin, Admin.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());
    }

    @Test
    public void read() {
        Admin admin= AdminFactory.buildAdmin("espoir",234,"dite","admin");
        ResponseEntity responseEntity=restTemplate.withBasicAuth("user","password")
                .getForEntity(Base_url +"/reads", Admin.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void readAll() {
    }
}