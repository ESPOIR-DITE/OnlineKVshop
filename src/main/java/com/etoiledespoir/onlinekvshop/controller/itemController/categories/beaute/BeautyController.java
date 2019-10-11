package com.etoiledespoir.onlinekvshop.controller.itemController.categories.beaute;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.repository.item.category.beaute.BeautyRepInt;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import com.etoiledespoir.onlinekvshop.service.itemService.category.beaute.impl.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/OKVS/beaty")
public class BeautyController implements Icontroller<BeautyMakeup, String> {

    @Autowired
    BeautyService beautyService;

    @PostMapping("/create")
    @Override
    public BeautyMakeup create(@RequestBody BeautyMakeup beautyMakeup) {
        return beautyService.creat(beautyMakeup);
    }

    @GetMapping("/read")
    @Override
    public BeautyMakeup read(@RequestParam("id") String id) {
        return beautyService.read(id);
    }

    @PostMapping("/update")
    @Override
    public BeautyMakeup update(@RequestBody BeautyMakeup beautyMakeup) {
        return beautyService.Update(beautyMakeup);
    }

    @GetMapping("/Delete")
    @Override
    public BeautyMakeup delete(@RequestParam("id") String id) {
        return beautyService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<BeautyMakeup> readAll() {
        return beautyService.readAll();
    }
}