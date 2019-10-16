package com.etoiledespoir.onlinekvshop.controller.itemController.item;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.Items;
import com.etoiledespoir.onlinekvshop.service.itemService.items.impl.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/item")
public class ItemController implements Icontroller<Items,String> {
    @Autowired
    private ItemsService item;

    @PostMapping("/creat")
    @Override
    public Items create(@RequestBody Items item) {
        return this.item.creat(item);
    }
    @GetMapping("/read")
    @Override
    public Items read(@RequestParam(value = "id")  String id) {
        return item.read(id);
    }
    @PostMapping("/update")
    @Override
    public Items update(@RequestBody Items item) {
        return this.item.Update(item);
    }
    @GetMapping("/delete")
    @Override
    public Items delete(@RequestParam(value = "id") String id) {
        return item.delete(id);
    }
    @GetMapping("/reads")
    @Override
    public List<Items> readAll() {
        return item.readAll();
    }
}
