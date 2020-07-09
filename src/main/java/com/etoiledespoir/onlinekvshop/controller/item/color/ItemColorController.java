package com.etoiledespoir.onlinekvshop.controller.item.color;

import com.etoiledespoir.onlinekvshop.domain.item.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.factory.domain.item.color.impl.ItemColorFactory;
import com.etoiledespoir.onlinekvshop.service.item.color.ItemColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/OKVS/itemColor")
public class ItemColorController {
    @Autowired
    ItemColorService itemColorService;
    @GetMapping("/read")
    public ItemColor read(@RequestParam("id")String id){
        return itemColorService.read(id);
    }
    @GetMapping("/reads")
    public List<ItemColor> reads(){
        return itemColorService.readAll();
    }
    @GetMapping("/readsfor")
    public List<ItemColor> readFor(@RequestParam("id") String id){
        return itemColorService.getColorIdList(id);
    }
    @GetMapping("/deleteAllFor")
    public Boolean DeleteAll(@RequestParam("itemId")String itemId){
        return itemColorService.DeleteAllOfItem(itemId);
    }
    @PostMapping("/createAll")
    public Boolean createAll(@RequestBody ArrayList<ItemColor> itemColorArrayList){
        ArrayList<ItemColor> itemColorList=new ArrayList<>();
        for(ItemColor itemColor:itemColorArrayList){
            ItemColor itemColor1= ItemColorFactory.getItemColer(itemColor.getItemId(),itemColor.getColorId());
            itemColorList.add(itemColor1);
        }
        return itemColorService.CreateAllOf(itemColorList);
    }
}
