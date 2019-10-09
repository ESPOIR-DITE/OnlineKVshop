package com.etoiledespoir.onlinekvshop.controller.admin;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.service.AdminService.impl.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "OKVS/admin")
public class AdminController implements Icontroller<Admin,String> {
    @Autowired
    private AdminServices admin;
@GetMapping("/home")
public String getHome()
{
    return "home";
}
    @PostMapping("/creat")
    @Override
    public Admin create(@RequestBody Admin admin) {
        return this.admin.creat(admin);
    }

    @GetMapping("/read")
    @Override
    public Admin read(@RequestParam(value = "id")String id) {
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
