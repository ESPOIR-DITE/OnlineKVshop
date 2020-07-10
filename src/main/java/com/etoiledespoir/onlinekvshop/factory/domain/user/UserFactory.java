package com.etoiledespoir.onlinekvshop.factory.domain.user;

import com.etoiledespoir.onlinekvshop.domain.user.User;


public class UserFactory {
    public static User getCustomer(String email, String name, String status, String surname){
        return new User.Builder(email)
                .buildName(name)
                .builderStatus(status)
                .buildSurName(surname)
                .build();
    }
}
