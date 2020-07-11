package com.etoiledespoir.onlinekvshop.controller.item.braind;

import com.etoiledespoir.onlinekvshop.domain.item.braind.ItemBrand;
import com.etoiledespoir.onlinekvshop.factory.domain.item.braind.ItemBraindFactory;
import com.etoiledespoir.onlinekvshop.service.item.braind.ItemBraindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/itemBrand")
public class ItemBrandController {
    @Autowired
    ItemBraindService itemBraindService;
    public ItemBrand create(@RequestBody ItemBrand itemBrand){
        ItemBrand itemBrand1 = ItemBraindFactory.getItemBraind(itemBrand.getBrandId(),itemBrand.getItemId());
        return itemBraindService.creat(itemBrand1);
    }
    @GetMapping("/read")
    public ItemBrand read(@RequestParam("id")String id){
        return itemBraindService.read(id);
    }
    @GetMapping("/reads")
    public List<ItemBrand> reads(){
        return itemBraindService.readAll();
    }
    @GetMapping("/readWithItemId")
    public ItemBrand readWithItemId(@RequestParam("itemId") String itemId){
        return itemBraindService.readWithItemId(itemId);
    }
    @PostMapping("/update")
    public ItemBrand updateItemBraind(@RequestBody ItemBrand itemBrand){
        return itemBraindService.Update(itemBrand);
    }

}
