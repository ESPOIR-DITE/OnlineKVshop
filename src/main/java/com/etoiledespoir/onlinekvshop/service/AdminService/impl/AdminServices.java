package com.etoiledespoir.onlinekvshop.service.AdminService.impl;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;
import com.etoiledespoir.onlinekvshop.repository.AdminRepo.AdminInt;
import com.etoiledespoir.onlinekvshop.service.AdminService.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AdminServices implements IAdminService {

    private static AdminServices adminServices=null;

    @Autowired
    AdminInt adminInt;
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
        Admin result= AdminFactory.buildAdmin(admin.getName(),admin.getSurName(),admin.getEmail());
      return this.adminInt.save(result);
    }

    @Override
    public Admin delete(String id) {
       Optional <Admin> myadmin=adminInt.findById(id);
       if(myadmin!=null){
           this.adminInt.deleteById(id);
       }
      return myadmin.orElse(null);
    }

    @Override
    public Admin Update(Admin admin) {
        Optional <Admin> myadmin=adminInt.findById(admin.getId());
        if(myadmin!=null){
           adminInt.save(admin);
        }
        return myadmin.orElse(null);
    }

    @Override
    public Admin read(String id) {
        Optional<Admin> myadmin = this.adminInt.findById(id);
        return myadmin.orElse(null);
    }

    @Override
    public List<Admin> readAll() {
        return this.adminInt.findAll();
    }

}
