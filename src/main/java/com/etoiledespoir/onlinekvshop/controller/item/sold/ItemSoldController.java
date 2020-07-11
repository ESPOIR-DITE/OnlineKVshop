package com.etoiledespoir.onlinekvshop.controller.item.sold;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.itemSold.ItemSold;
import com.etoiledespoir.onlinekvshop.factory.domain.item.ItemSoldFact;
import com.etoiledespoir.onlinekvshop.service.item.sold.impl.ItemSoldService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/itemsold")
public class ItemSoldController   implements Icontroller<ItemSold,String> {
@Autowired
private ItemSoldService itemSoldService;


    @PostMapping("create")
    @Override
    public ItemSold create(@RequestBody ItemSold itemSold) throws UnirestException {
        ItemSold itemSold1 = ItemSoldFact.getItemS(itemSold.getItemId(),itemSold.getOrderId());
        return itemSoldService.creat(itemSold1);
    }

    @GetMapping("read")
    @Override
    public ItemSold read(String id) {
        return itemSoldService.read(id);
    }

    @PostMapping("update")
    @Override
    public ItemSold update(ItemSold itemSold) {
        return itemSoldService.Update(itemSold);
    }

    @GetMapping("delete")
    @Override
    public ItemSold delete(String id) {
        return itemSoldService.delete(id);
    }

    @GetMapping("reads")
    @Override
    public List<ItemSold> readAll() {
        return itemSoldService.readAll();
    }
}
