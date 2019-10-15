package com.etoiledespoir.onlinekvshop.factory.domain.login;

import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class LoginFactory {
    public static Login getLogin(String email,String userTupe){
        return new Login.Builder(email)
                .buildPassword(Igenerator.getSuffixFromClassName(LoginFactory.class))
                .buildUserType(userTupe)
                .build();
    }
    public static Login updateLogin(String email,String password,String userTupe){
        return new Login.Builder(email)
                .buildPassword(password)
                .buildUserType(userTupe)
                .build();
    }
}