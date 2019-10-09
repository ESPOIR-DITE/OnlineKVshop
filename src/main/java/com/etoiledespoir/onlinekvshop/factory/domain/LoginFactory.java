package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.users.userType.login.Login;

public class LoginFactory {
    public static Login getLogin(String email,String password,String userTupe){
        return new Login.Builder(email)
                .buildPassword(password)
                .buildUserType(userTupe)
                .build();
    }
}