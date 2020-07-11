package com.etoiledespoir.onlinekvshop.controller.item.type;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.itemType.ItemType;
import com.etoiledespoir.onlinekvshop.service.item.type.ItemTypeService;
import com.mashape.unirest.http.exceptions.UnirestException;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/itemtype")
public class ItemTypeController implements Icontroller<ItemType,String> {
    @Autowired
    private ItemTypeService itemTypeService;
    @PostMapping("create")
    @Override
    public ItemType create(@RequestBody ItemType itemType) throws UnirestException {
        return itemTypeService.creat(itemType);
    }

    @GetMapping("read")
    @Override
    public ItemType read(@RequestParam("id") String id) {
        return itemTypeService.read(id);
    }

    @PostMapping("update")
    @Override
    public ItemType update(@RequestBody ItemType itemType) {
        return itemTypeService.Update(itemType);
    }

    @GetMapping("delete")
    @Override
    public ItemType delete(@RequestParam("id") String id) {
        return itemTypeService.delete(id);
    }

    @GetMapping("reads")
    @Override
    public List<ItemType> readAll() {
        return itemTypeService.readAll();
    }
}
