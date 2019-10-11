package com.etoiledespoir.onlinekvshop.factory.domain.login;

import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginFactoryTest {

    @Test
    public void getLogin() {
        Login login=LoginFactory.getLogin("@com","customer");
        System.out.println(login.toString());
    }

    @Test
    public void updateLogin() {
    }
}