package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AdminFactory {
    public static Admin buildAdmin(String name,String surName,String email){
        return new Admin.Builder(name)
                .builderEmail(email)
                .buildsurName(surName)
                .buildId(Igenerator.getSuffixFromClassName(AdminFactory.class))
                .buil();

    }
    public static Admin buildAdmin(String id,String name,String surName,String email){
        return new Admin.Builder(name)
                .builderEmail(email)
                .buildsurName(surName)
                .buildId(id)
                .buil();

    }

}
