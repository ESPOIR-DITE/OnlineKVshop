package com.etoiledespoir.onlinekvshop.controller.customer;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.Customer;
import com.etoiledespoir.onlinekvshop.service.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
@RequestMapping(value = "/OKVS/customer")
public class CustomerController implements Icontroller<Customer, String> {

    @Autowired
    private CustomerService customer;
    @GetMapping("/home")
    public String getHome(){
        return "home";

    }

    @PostMapping("/creat")
    @Override
    public Customer create(@RequestBody Customer customer) {
        return this.customer.creat(customer);
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
    public ArrayList<String> readAll() {
        return this.customer.readAll();
    }
    /** @Autowired
    private CustomerService customer;

    @PostMapping("/new")
    public Customer create(@RequestBody Customer customer){
        Preconditions.checkNotNull(customer);
        return this.customer.creat(customer);
    }

    @GetMapping("/read/{id}")
    public Customer read(@PathVariable String id){
        return customer.read(id);
    }

    @GetMapping("reads")
    public ArrayList<String> readAll(){
        return customer.readAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public Customer delete(@PathVariable("id")String id){
        return customer.delete(id);
    }
*/



}
