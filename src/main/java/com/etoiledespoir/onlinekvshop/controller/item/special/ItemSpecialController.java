package com.etoiledespoir.onlinekvshop.controller.item.special;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.specials.ItemSpecial;
import com.etoiledespoir.onlinekvshop.factory.domain.item.special.SpecialFactory;
import com.etoiledespoir.onlinekvshop.service.item.special.ItemSpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/special")
public class ItemSpecialController implements Icontroller<ItemSpecial,String> {
    @Autowired
    ItemSpecialService itemSpecialService;

    @PostMapping("/create")
    @Override//(String endPeriod,String title,String itemId,String period,String description,double previousePrice,double actualPrice)
    public ItemSpecial create(@RequestBody ItemSpecial itemSpecial) {
        ItemSpecial itemSpecial1= SpecialFactory.getItemSpecial(itemSpecial.getEndPeriod(),itemSpecial.getTitle(),itemSpecial.getItemId(),itemSpecial.getPeriod(),itemSpecial.getDescription(),itemSpecial.getPreviousePrice(),itemSpecial.getActualPrice());
        return itemSpecialService.creat(itemSpecial1);
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
