package com.etoiledespoir.onlinekvshop.controller.user.gender;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.user.gender.UserGender;
import com.etoiledespoir.onlinekvshop.service.user.gender.CustGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/customerGender")
public class CustomerGenderController implements Icontroller<UserGender,String> {
    @Autowired
    CustGenderService custGenderService;

    @PostMapping("/create")
    @Override
    public UserGender create(@RequestBody UserGender userGender) {
        return custGenderService.creat(userGender);
    }

    @GetMapping("/read")
    @Override
    public UserGender read(@RequestParam("id") String id) {
        return custGenderService.read(id);
    }

    @PostMapping("/update")
    @Override
    public UserGender update(@RequestBody UserGender userGender) {
        return custGenderService.Update(userGender);
    }

    @GetMapping("/delete")
    @Override
    public UserGender delete(@RequestParam("id")String id) {
        return custGenderService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<UserGender> readAll() {
        return custGenderService.readAll();
    }
}
