package com.etoiledespoir.onlinekvshop.controller.special;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.controller.itemController.item.ItemController;
import com.etoiledespoir.onlinekvshop.domain.specials.ItemSpecial;
import com.etoiledespoir.onlinekvshop.service.special.ItemSpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/special")
public class ItemSpecialController implements Icontroller<ItemSpecial,String> {
    @Autowired
    ItemSpecialService itemSpecialService;

    @PostMapping("/create")
    @Override
    public ItemSpecial create(@RequestBody ItemSpecial itemSpecial) {
        return itemSpecialService.creat(itemSpecial);
    }

    @GetMapping("/read")
    @Override
    public ItemSpecial read(@RequestParam("id") String id) {
        return itemSpecialService.read(id);
    }

    @PostMapping("/update")
    @Override
    public ItemSpecial update(@RequestBody ItemSpecial itemSpecial) {
        return itemSpecialService.Update(itemSpecial);
    }

    @GetMapping("/delete")
    @Override
    public ItemSpecial delete(@RequestParam("id") String id) {
        return itemSpecialService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<ItemSpecial> readAll() {
        return itemSpecialService.readAll();
    }


}
