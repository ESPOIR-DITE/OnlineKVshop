package com.etoiledespoir.onlinekvshop.factory.domain.user;

import com.etoiledespoir.onlinekvshop.domain.user.Roles;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class RoleFactory {
    public static Roles buildAdmin(String name, String description){
        return new Roles.Builder(Igenerator.getSuffixFromClassName(RoleFactory.class))
                .buildName(name)
                .buildDescription(description)
                .build();
    }
}
