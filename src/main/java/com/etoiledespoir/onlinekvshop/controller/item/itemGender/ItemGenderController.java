package com.etoiledespoir.onlinekvshop.controller.item.itemGender;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.gender.ItemGender;
import com.etoiledespoir.onlinekvshop.service.user.gender.ItemGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/itemGender")
public class ItemGenderController implements Icontroller<ItemGender,String> {
    @Autowired
    ItemGenderService itemGender;

    @PostMapping("/create")
    @Override
    public ItemGender create(ItemGender itemGender) {
        return null;
    }

    @GetMapping("/read")
    @Override
    public ItemGender read(@RequestParam("id") String id) {
        return itemGender.read(id);
    }

    @Override
    public ItemGender update(ItemGender itemGender) {
        return null;
    }

    @Override
    public ItemGender delete(String id) {
        return null;
    }

    @GetMapping("/reads")
    @Override
    public List<ItemGender> readAll() {
        return itemGender.readAll();
    }
    @GetMapping("/readWithItemId")
    public ItemGender readWithItemId(@RequestParam("itemId") String itemId){
        return itemGender.readWithItemId(itemId);
    }

}
