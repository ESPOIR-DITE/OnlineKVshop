package com.etoiledespoir.onlinekvshop.service.AdminService;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.repository.AdminRepoFactory;
import com.etoiledespoir.onlinekvshop.repository.AdminRepo.AdminRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdminServices implements IAdminService {

    private static AdminServices adminServices=null;
    private AdminRepository admin= AdminRepoFactory.getAdmin();

    private AdminServices() {
    }
    public static AdminServices getadminService()
    {
        if(adminServices==null){
            return adminServices=new AdminServices();
        }return adminServices;
    }

    @Override
    public Admin creat(Admin admin) {
        return this.admin.creat(admin);
    }

    @Override
    public Admin delete(String id) {
        return this.admin.delete(id);
    }

    @Override
    public Admin Update(Admin admin) {
        return this.admin.Update(admin);
    }

    @Override
    public Admin read(String id) {
        return this.admin.read(id);
    }

    @Override
    public ArrayList<String> readAll() {
        return this.admin.readAll();
    }

    @Override
    public String getPremier() {
        return null;
    }
}
