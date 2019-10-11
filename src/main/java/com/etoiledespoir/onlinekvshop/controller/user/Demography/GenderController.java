package com.etoiledespoir.onlinekvshop.controller.user.Demography;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;
import com.etoiledespoir.onlinekvshop.domain.users.Demography.helper.GenderHelper;
import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;
import com.etoiledespoir.onlinekvshop.factory.domain.bridge.CustomerBridgeFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.gender.GenderFactory;
import com.etoiledespoir.onlinekvshop.repository.user.Demography.GenderRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import com.etoiledespoir.onlinekvshop.service.user.Demography.impl.GenderService;
import com.etoiledespoir.onlinekvshop.service.user.bridge.impl.CustomerBridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/OKVS/gender")
public class GenderController implements Icontroller<Gender, String> {

    @Autowired
    CustomerBridgeService customerBridgeService;
    @Autowired
    GenderService genderService;
    CustomerBridge csutB0=null;


    @PostMapping("/create")
    public Gender create(@RequestBody GenderHelper gH) {
        Gender gender= GenderFactory.getGender(gH.getAge(),gH.getGender(),gH.getDescription());
        System.out.println(gender.toString());
        Gender gender1=genderService.creat(gender);
        CustomerBridge custB1=customerBridgeService.readWithEmail(gH.getEmail());
        if(custB1==null){
            csutB0= CustomerBridgeFactory.getCustomerBridge(gH.getEmail(),"",gender1.getId());
            customerBridgeService.creat(csutB0);
            return gender1;
        } else if(custB1!=null) {
            csutB0 = CustomerBridgeFactory.updateCustomerBridge(custB1.getId(), custB1.getEmail(), custB1.getAddressId(), gender1.getId());
            customerBridgeService.creat(csutB0);
            return gender1;
        }

        return null;
    }

    @GetMapping("/read")
    @Override
    public Gender read(@RequestParam("id") String id) {
        return genderService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Gender update(@RequestBody Gender gender) {
        return genderService.Update(gender);
    }

    @GetMapping("/delete")
    @Override
    public Gender delete(@RequestParam("id") String id) {
        return genderService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Gender> readAll() {
        return genderService.readAll();
    }
    @Override
    public Gender create(Gender gender) {
        return null;
    }
}
