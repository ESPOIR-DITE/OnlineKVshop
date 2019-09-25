package com.etoiledespoir.onlinekvshop.controller.item;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.service.itemService.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/OKVS/item")
public class ItemController implements Icontroller<Item,String> {
    @Autowired
    private ItemService item;

    @PostMapping("/creat")
    @Override
    public Item create(@RequestBody Item item) {
        return this.item.creat(item);
    }
    @GetMapping("/read")
    @Override
    public Item read(@RequestParam(value = "id")  String id) {
        return item.read(id);
    }
    @PostMapping("/update")
    @Override
    public Item update(@RequestBody Item item) {
        return this.item.Update(item);
    }
    @GetMapping("/delete")
    @Override
    public Item delete(@RequestParam(value = "id") String id) {
        return item.delete(id);
    }
    @GetMapping("/reads")
    @Override
    public ArrayList<String> readAll() {
        return item.readAll();
    }
}
