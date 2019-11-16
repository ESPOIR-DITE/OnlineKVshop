package com.etoiledespoir.onlinekvshop.controller.braind;

import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.service.braind.ItemBraindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("OKVS/itemBraind")
public class ItemBrandController {
    @Autowired
    ItemBraindService itemBraindService;
    @GetMapping("/read")
    public ItemBraind read(@RequestParam("id")String id){
        return itemBraindService.read(id);
    }
    @GetMapping("/reads")
    public List<ItemBraind> reads(){
        return itemBraindService.readAll();
    }
}
