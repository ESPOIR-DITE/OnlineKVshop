package com.etoiledespoir.onlinekvshop.controller.item.size;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.size.ItemSize;
import com.etoiledespoir.onlinekvshop.factory.domain.item.size.ItemSizeFactory;
import com.etoiledespoir.onlinekvshop.service.item.size.ItemSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("OKVS/itemSize")
public class ItemSizeController implements Icontroller<ItemSize,String> {
    @Autowired
    ItemSizeService itemSizeService;

    @PostMapping("/create")
    @Override
    public ItemSize create(@RequestBody ItemSize itemSize) {
        return itemSizeService.creat(itemSize);
    }

    @GetMapping("/read")
    @Override
    public ItemSize read(@RequestParam("id") String id) {
        return itemSizeService.read(id);
    }

    @PostMapping("/update")
    @Override
    public ItemSize update(@RequestBody ItemSize itemSize) {
        return itemSizeService.Update(itemSize);
    }

    @GetMapping("/delete")
    @Override
    public ItemSize delete(@RequestParam("id") String id) {
        return itemSizeService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<ItemSize> readAll() {
        return itemSizeService.readAll();
    }
    @GetMapping("/readWithItem")
    public List<ItemSize> productSizeList(@RequestParam("id") String itemId){
        return itemSizeService.productSizeList(itemId);
    }

    @GetMapping("/deleteAllOf")
    public Boolean deleteAllOf(@RequestParam("productId")String productId){
        return itemSizeService.deleteAllOf(productId);
    }
    @PostMapping("/createAll")
    public Boolean createAll(@RequestBody ArrayList<ItemSize> productType){
        ArrayList<ItemSize> toSend=new ArrayList<>();
        for(ItemSize productT:productType ){
            ItemSize itemSize = ItemSizeFactory.getProductSize(productT.getSizeId(),productT.getItemId());
            toSend.add(itemSize);
            System.out.println(itemSize);
        }
        return itemSizeService.createAll(toSend);
    }
}
