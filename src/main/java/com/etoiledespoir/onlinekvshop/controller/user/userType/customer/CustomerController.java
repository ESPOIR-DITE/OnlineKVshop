package com.etoiledespoir.onlinekvshop.controller.user.userType.customer;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.CustomerGender;
import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.factory.domain.login.LoginFactory;
import com.etoiledespoir.onlinekvshop.service.gender.CustGenderService;
import com.etoiledespoir.onlinekvshop.service.user.login.impl.LoginService;
import com.etoiledespoir.onlinekvshop.service.user.userType.customerService.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/customer")
public class CustomerController implements Icontroller<Customer, String> {

    @Autowired
    private CustomerService customer;
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
    public Customer create(@RequestBody Customer customer) {
        Login login= LoginFactory.getLogin(customer.getEmail(),"customer");
        Login result= loginService.creat(login);
        if(result!=null) {
            return this.customer.creat(customer);
        }
        return null;
    }
    @GetMapping("/read")
    @Override
    public Customer read(@RequestParam(value = "id") String id) {
        return this.customer.read(id);
    }
    @PostMapping("/update")
    @Override
    public Customer update(@RequestBody Customer customer) {
        return this.customer.Update(customer);
    }

    @GetMapping("/delete")
    @Override
    public Customer delete(@RequestParam(value = "id") String id) {
        return this.customer.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Customer> readAll() {
        return this.customer.readAll();
    }

}
