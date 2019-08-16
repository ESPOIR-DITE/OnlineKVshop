package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.AdminService.AdminServices;

public class AdminServiceFact {
    public static AdminServices getAdminService(){
        return AdminServices.getadminService();
    }
}
