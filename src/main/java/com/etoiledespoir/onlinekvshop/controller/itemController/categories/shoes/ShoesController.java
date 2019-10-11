package com.etoiledespoir.onlinekvshop.controller.itemController.categories.shoes;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Shoes;
import com.etoiledespoir.onlinekvshop.repository.item.category.shoes.ShoeasRepInt;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import com.etoiledespoir.onlinekvshop.service.itemService.category.shoes.impl.ShoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/OKVS/shoes")
public class ShoesController implements Icontroller<Shoes, String> {

    @Autowired
    ShoesService shoesService;

    @PostMapping("/create")
    @Override
    public Shoes create(@RequestBody Shoes shoes) {
        return shoesService.creat(shoes);
    }

    @GetMapping("/read")
    @Override
    public Shoes read(@RequestParam("id") String id) {
        return shoesService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Shoes update(@RequestBody Shoes shoes) {
        return shoesService.Update(shoes);
    }

    @GetMapping("/delete")
    @Override
    public Shoes delete(@RequestParam("id") String id) {
        return shoesService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Shoes> readAll() {
        return shoesService.readAll();
    }
}