package com.etoiledespoir.onlinekvshop.controller.user.userType.admin;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.login.LoginFactory;
import com.etoiledespoir.onlinekvshop.service.user.login.impl.LoginService;
import com.etoiledespoir.onlinekvshop.service.user.userType.AdminService.impl.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "OKVS/admin")
public class AdminController implements Icontroller<Admin, String> {
    @Autowired
    private AdminServices admin;
    @Autowired
    private LoginService loginService;

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @PostMapping("/creat")
    @Override
    public Admin create(@RequestBody Admin admin) {
        Login login= LoginFactory.getLogin(admin.getEmail(),"admin");
        if(login!=null) {
            loginService.creat(login);
            return this.admin.creat(admin);
        } return null;
    }

    @GetMapping("/read")
    @Override
    public Admin read(@RequestParam(value = "id") String id) {
        return admin.read(id);
    }

    @PostMapping("/update")
    @Override
    public Admin update(@RequestBody Admin admin) {
        return this.admin.Update(admin);
    }

    @GetMapping("/delete")
    @Override
    public Admin delete(@RequestParam(value = "id") String id) {
        return admin.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Admin> readAll() {
        return this.admin.readAll();
    }
}
