package com.etoiledespoir.onlinekvshop.controller.user.Demography.types;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.CustomerGender;
import com.etoiledespoir.onlinekvshop.service.gender.CustGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/customerGender")
public class CustomerGenderController implements Icontroller<CustomerGender,String> {
    @Autowired
    CustGenderService custGenderService;

    @PostMapping("/create")
    @Override
    public CustomerGender create(@RequestBody CustomerGender customerGender) {
        return custGenderService.creat(customerGender);
    }

    @GetMapping("/read")
    @Override
    public CustomerGender read(@RequestParam("id") String id) {
        return custGenderService.read(id);
    }

    @PostMapping("/update")
    @Override
    public CustomerGender update(@RequestBody CustomerGender customerGender) {
        return custGenderService.Update(customerGender);
    }

    @GetMapping("/delete")
    @Override
    public CustomerGender delete(@RequestParam("id")String id) {
        return custGenderService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<CustomerGender> readAll() {
        return custGenderService.readAll();
    }
}
