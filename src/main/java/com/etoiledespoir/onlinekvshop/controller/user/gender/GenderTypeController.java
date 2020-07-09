package com.etoiledespoir.onlinekvshop.controller.user.gender;
import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.gender.UserGender;
import com.etoiledespoir.onlinekvshop.domain.item.gender.ItemGender;
import com.etoiledespoir.onlinekvshop.service.user.gender.CustGenderService;
import com.etoiledespoir.onlinekvshop.service.user.gender.ItemGenderService;
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
    public List<UserGender> CustreadAll() {
        return custGenderService.readAll();
    }

}
