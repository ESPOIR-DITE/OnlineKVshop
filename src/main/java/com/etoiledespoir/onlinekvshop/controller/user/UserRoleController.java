package com.etoiledespoir.onlinekvshop.controller.user;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.user.UserRole;
import com.etoiledespoir.onlinekvshop.factory.domain.user.UserRoleFactory;
import com.etoiledespoir.onlinekvshop.service.user.UserRoleService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/user_role/")
public class UserRoleController implements Icontroller<UserRole,String> {
    @Autowired
    private UserRoleService userRoleService;
    @PostMapping("create")
    @Override
    public UserRole create(@RequestBody UserRole userRole) throws UnirestException {
        UserRole userRole1 = UserRoleFactory.getUserRole(userRole.getEmail(),userRole.getRoleId(),userRole.getDate(),userRole.getDescription(),userRole.getActor());
        return userRoleService.creat(userRole1);
    }

    /***
     * reading with Email of te User
     * @param id
     * @return
     */
    @GetMapping("read")
    @Override
    public UserRole read(@RequestParam String id) {
        return userRoleService.read(id);
    }
    @PostMapping("update")
    @Override
    public UserRole update(@RequestBody UserRole userRole) {
        return userRoleService.Update(userRole);
    }
    @GetMapping("delete")
    @Override
    public UserRole delete(@RequestParam("id") String id) {
        return userRoleService.delete(id);
    }
    @GetMapping("reads")
    @Override
    public List<UserRole> readAll() {
        return userRoleService.readAll();
    }
}
