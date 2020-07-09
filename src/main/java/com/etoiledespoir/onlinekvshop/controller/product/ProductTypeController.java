package com.etoiledespoir.onlinekvshop.controller.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ItemType;
import com.etoiledespoir.onlinekvshop.service.item.product.ItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OKVS/productType")
public class ProductTypeController {
    @Autowired
    ItemTypeService itemTypeService;
    @GetMapping("/read")
    public ItemType read(@RequestParam("id") String id){
        return itemTypeService.readWithTypeId(id);
    }
    @GetMapping("/reads")
    public List<ItemType> reads(){
        return itemTypeService.readAll();
    }
    @GetMapping("readAll")
    public List<ItemType> readAllOf(@RequestParam("id") String id){
        return itemTypeService.readAllOf(id);
    }

}
