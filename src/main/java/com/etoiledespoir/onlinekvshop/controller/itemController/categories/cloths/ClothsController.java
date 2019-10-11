package com.etoiledespoir.onlinekvshop.controller.itemController.categories.cloths;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Cloths;
import com.etoiledespoir.onlinekvshop.repository.Irepository;
import com.etoiledespoir.onlinekvshop.repository.item.category.cloths.ClothsRepInt;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import com.etoiledespoir.onlinekvshop.service.itemService.category.cloths.impl.ClothsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/OKVS/cloths")
public class ClothsController implements Icontroller<Cloths, String> {
   @Autowired
    ClothsService clothsService;

   @PostMapping("/create")
    @Override
    public Cloths create(@RequestBody Cloths cloths) {
        return clothsService.creat(cloths);
    }

    @GetMapping("/read")
    @Override
    public Cloths read(@RequestParam("id") String id) {
        return clothsService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Cloths update(@RequestBody Cloths cloths) {
        return clothsService.Update(cloths);
    }

    @GetMapping("/delete")
    @Override
    public Cloths delete(@RequestParam("id") String id) {
        return clothsService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Cloths> readAll() {
        return clothsService.readAll();
    }
}