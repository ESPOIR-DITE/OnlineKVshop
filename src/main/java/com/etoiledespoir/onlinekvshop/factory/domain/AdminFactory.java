package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AdminFactory {
    public static Admin buildAdmin(String name, String surName, String email){
        return new Admin.Builder(name)
                .buildEmail(email)
                .buildSurName(surName)
                .buil();

    }
}
