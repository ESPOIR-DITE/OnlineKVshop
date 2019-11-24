package com.etoiledespoir.onlinekvshop.controller.color;

import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.service.color.ItemColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
