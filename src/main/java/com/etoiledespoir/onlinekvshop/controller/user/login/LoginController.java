package com.etoiledespoir.onlinekvshop.controller.user.login;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import com.etoiledespoir.onlinekvshop.domain.users.login.LoginHelper;
import com.etoiledespoir.onlinekvshop.service.user.login.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/login")
public class LoginController implements Icontroller<Login,String> {
    @Autowired
    private LoginService loginRepository;

    @PostMapping("/create")
    @Override
    public Login create(@RequestBody Login login) {
        return loginRepository.creat(login);
    }

    @GetMapping("/read")
    @Override
    public Login read(@RequestParam("id") String id) {
        return loginRepository.read(id);
    }

    @PostMapping("/update")
    @Override
    public Login update(@RequestBody Login login) {
        return loginRepository.Update(login);
    }

    @GetMapping("/delete")
    @Override
    public Login delete(@RequestParam("id") String id) {
        return loginRepository.delete(id);
    }

    @GetMapping("reads")
    @Override
    public List<Login> readAll() {
        return loginRepository.readAll();
    }

    @PostMapping("/log")
    public Login login(@RequestBody Login loginHelper){
        return loginRepository.loging(loginHelper.getEmail(),loginHelper.getPassword());
    }
    @GetMapping("/readwithpassword")
    public Login readWithPassword(@RequestParam("id") String pasword){
        return loginRepository.readWithPassword(pasword);
    }
    @PostMapping("/univelogin")
    public Login UniversalLogin(@RequestBody Login login){
        return loginRepository.loging(login.getEmail(),login.getPassword());
    }
}
