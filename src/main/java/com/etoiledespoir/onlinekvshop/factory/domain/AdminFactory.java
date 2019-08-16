package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Admin;

public class AdminFactory {
    public static Admin buildAdmin(String name,int id,String userName,String password)
    {
        return new Admin.Builder(name)
                .buildId(id)
                .builderPassword(password)
                .buildUserName(userName)
                .builAdmin();
    }

}
