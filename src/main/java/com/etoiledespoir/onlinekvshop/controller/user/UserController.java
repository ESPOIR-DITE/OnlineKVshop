package com.etoiledespoir.onlinekvshop.controller.user;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.user.User;
import com.etoiledespoir.onlinekvshop.domain.user.login.Login;
import com.etoiledespoir.onlinekvshop.factory.domain.login.LoginFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.user.UserFactory;
import com.etoiledespoir.onlinekvshop.service.user.gender.CustGenderService;
import com.etoiledespoir.onlinekvshop.service.user.login.LoginService;
import com.etoiledespoir.onlinekvshop.service.user.UserService;
import com.etoiledespoir.onlinekvshop.util.email.SendEmailSMTP;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/user")
public class UserController implements Icontroller<User, String> {

    @Autowired
    private UserService userService;
    @Autowired
    CustGenderService custGenderService;
    @Autowired
    private LoginService loginService;

    @GetMapping("/home")
    public String getHome(){
        return "home";
    }
    @PostMapping("/create")
    @Override
    public User create(@RequestBody User user) throws UnirestException {
        Login login= LoginFactory.getLogin(user.getEmail(),"customer");
        Login result= loginService.creat(login);
        if(result!=null) {
            User user1 = UserFactory.getCustomer(user.getEmail(),user.getName(),"new",user.getSurName());
            SendEmailSMTP.sendSimpleMessage(user.getEmail(),001,result.getPassword(),user.getName());
            return this.userService.creat(user1);
        }
        return null;
    }
    @GetMapping("/read")
    @Override
    public User read(@RequestParam(value = "id") String id) {
        return this.userService.read(id);
    }

    @GetMapping("/readWIthPassword")
    public Login readWith(@RequestParam(value = "id") String id) {
        return this.loginService.readWithPassWord(id);
    }

    @PostMapping("/update")
    @Override
    public User update(@RequestBody User customer) {
        return this.userService.Update(customer);
    }

    @GetMapping("/delete")
    @Override
    public User delete(@RequestParam(value = "id") String id) {
        return this.userService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<User> readAll() {
        return this.userService.readAll();
    }

}
