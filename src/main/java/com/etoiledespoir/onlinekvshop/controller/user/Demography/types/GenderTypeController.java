package com.etoiledespoir.onlinekvshop.controller.user.Demography.types;
import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.CustomerGender;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import com.etoiledespoir.onlinekvshop.service.gender.CustGenderService;
import com.etoiledespoir.onlinekvshop.service.gender.ItemGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OKVS/gendeType")
public class GenderTypeController implements Icontroller<ItemGender,String> {
    @Autowired
    ItemGenderService itemGenderService;
    @Autowired
    CustGenderService custGenderService;
    @Override
    public ItemGender create(ItemGender itemGender) {
        return null;
    }

    @Override
    public ItemGender read(String id) {
        return null;
    }

    @Override
    public ItemGender update(ItemGender itemGender) {
        return null;
    }

    @Override
    public ItemGender delete(String id) {
        return null;
    }

    @GetMapping("/item/reads")
    @Override
    public List<ItemGender> readAll() {
        return itemGenderService.readAll();
    }
    @GetMapping("/customer/reads")
    public List<CustomerGender> CustreadAll() {
        return custGenderService.readAll();
    }

}
