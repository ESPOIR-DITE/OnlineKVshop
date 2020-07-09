package com.etoiledespoir.onlinekvshop.controller.user;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.Roles;
import com.etoiledespoir.onlinekvshop.factory.domain.user.RoleFactory;
import com.etoiledespoir.onlinekvshop.service.user.login.LoginService;
import com.etoiledespoir.onlinekvshop.service.user.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "OKVS/role")
public class RoleController implements Icontroller<Roles, String> {
    @Autowired
    private RoleService roleService;
    @Autowired
    private LoginService loginService;

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @PostMapping("/create")
    @Override
    public Roles create(@RequestBody Roles admin) {
        Roles login= RoleFactory.buildAdmin(admin.getName(),admin.getDescription());
        return this.roleService.creat(login);
    }
    @GetMapping("/read")
    @Override
    public Roles read(@RequestParam(value = "id") String id) {
        return roleService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Roles update(@RequestBody Roles admin) {
        return this.roleService.Update(admin);
    }

    @GetMapping("/delete")
    @Override
    public Roles delete(@RequestParam(value = "id") String id) {
        return roleService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Roles> readAll() {
        return this.roleService.readAll();
    }
}
