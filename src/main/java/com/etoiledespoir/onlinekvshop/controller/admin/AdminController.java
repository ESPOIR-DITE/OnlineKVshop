package com.etoiledespoir.onlinekvshop.controller.admin;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.Admin;
import com.etoiledespoir.onlinekvshop.service.AdminService.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping(value = "OKVS/admin")
public class AdminController implements Icontroller<Admin,String> {
    @Autowired
    private AdminServices admin;



    @PostMapping("/newadmin")
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
    public ArrayList<String> readAll() {
        return this.admin.readAll();
    }
}
