package com.etoiledespoir.onlinekvshop.factory.domain.user;

import com.etoiledespoir.onlinekvshop.domain.user.UserRole;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

import java.util.Date;

public class UserRoleFactory {
    public static UserRole getUserRole(String email,String roleId,Date date,String description,String actor){
        return new UserRole.Builder(Igenerator.getSuffixFromClassName(UserRoleFactory.class))
                .buildActor(actor)
                .buildDate(date)
                .buildDescription(description)
                .buildEmail(email)
                .buildRoleId(roleId)
                .build();
    }
}
