package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.user.userType.AdminService.impl.AdminServices;

public class AdminServiceFact {
    public static AdminServices getAdminService(){
        return AdminServices.getadminService();
    }
}
