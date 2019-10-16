package com.etoiledespoir.onlinekvshop.controller.itemController.categories.hair;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.impl.Hair;
import com.etoiledespoir.onlinekvshop.service.itemService.category.hair.impl.HairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/hair")
public class HairController implements Icontroller<Hair, String> {
@Autowired
    HairService hairService;

@PostMapping("/create")
    @Override
    public Hair create(@RequestBody Hair hair) {
        return hairService.creat(hair);
    }

    @GetMapping("/read")
    @Override
    public Hair read(@RequestParam("id") String id) {
        return hairService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Hair update(@RequestBody Hair hair) {
        return hairService.Update(hair);
    }

    @GetMapping("/delete")
    @Override
    public Hair delete(@RequestParam("id") String id) {
        return hairService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Hair> readAll() {
        return hairService.readAll();
    }
}