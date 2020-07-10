package com.etoiledespoir.onlinekvshop.service.user;

import com.etoiledespoir.onlinekvshop.domain.user.Roles;

import com.etoiledespoir.onlinekvshop.factory.domain.user.RoleFactory;
import com.etoiledespoir.onlinekvshop.repository.user.RoleRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements Iservice<Roles, String> {

    private static RoleService roleService =null;

    @Autowired
    private RoleRepository roleRepository;
    private RoleService() {
    }
    public static RoleService getadminService()
    {
        if(roleService ==null){
            return roleService =new RoleService();
        }return roleService;
    }

    @Override
    public Roles creat(Roles roles) {
        Roles result= RoleFactory.buildAdmin(roles.getName(),roles.getDescription());
      return this.roleRepository.save(result);
    }

    @Override
    public Roles delete(String id) {
        Roles roles1= getRole(id);
        if(roles1!=null){
            roleRepository.delete(roles1);
            return roles1;
        }
      return null;
    }

    @Override
    public Roles Update(Roles roles) {
        Roles roles1= getRole(roles.getId());
        if(roles1!=null){
            roleRepository.delete(roles1);
           roleRepository.save(roles);
        }
        return null;
    }

    @Override
    public Roles read(String id) {
        return getRole(id);
    }

    @Override
    public List<Roles> readAll() {
        return this.roleRepository.findAll();
    }

    public Roles getRole(String id){
        Optional<Roles> myadmin = this.roleRepository.findById(id);
        return myadmin.orElse(null);
    }
}
