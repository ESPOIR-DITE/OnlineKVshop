package com.etoiledespoir.onlinekvshop.service.user;

import com.etoiledespoir.onlinekvshop.domain.users.UserRole;
import com.etoiledespoir.onlinekvshop.repository.user.UserRoleRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleService implements Iservice<UserRole,String> {
    private static UserRoleService userRoleService;
    @Autowired
    private UserRoleRepository userRoleRepository;

    public static UserRoleService getUserRoleService() {
        if (userRoleService == null) {
            userRoleService = new UserRoleService();
        }
        return userRoleService;
    }

    @Override
    public UserRole creat(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole delete(String id) {
        UserRole userRole = get(id);
        if (userRole != null) {
            userRoleRepository.delete(userRole);
            return userRole;
        }
        return null;
    }

    @Override
    public UserRole Update(UserRole userRole1) {
        UserRole userRole = get(userRole1.getId());
        if (userRole != null) {
            userRoleRepository.delete(userRole);
            return creat(userRole1);
        }
        return null;
    }

    @Override
    public UserRole read(String id) {
        for(UserRole userRole: readAll()){
            if(userRole.getEmail().equals(id)){
                return userRole;
            }
        }
        return get(id);
    }

    @Override
    public List<UserRole> readAll() {
        return userRoleRepository.findAll();
    }
    public UserRole get(String id){
        Optional<UserRole> userRoleOptional = userRoleRepository.findById(id);
        return userRoleOptional.orElse(null);
    }
}
