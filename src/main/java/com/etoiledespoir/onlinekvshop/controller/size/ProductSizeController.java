package com.etoiledespoir.onlinekvshop.controller.size;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.size.ProductSize;
import com.etoiledespoir.onlinekvshop.service.size.ItemSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/productSize")
public class ProductSizeController implements Icontroller<ProductSize,String> {
    @Autowired
    ItemSizeService itemSizeService;

    @PostMapping("/create")
    @Override
    public ProductSize create(@RequestBody ProductSize productSize) {
        return itemSizeService.creat(productSize);
    }

    @GetMapping("/read")
    @Override
    public ProductSize read(@RequestParam("id") String id) {
        return itemSizeService.read(id);
    }

    @PostMapping("/update")
    @Override
    public ProductSize update(@RequestBody ProductSize productSize) {
        return itemSizeService.Update(productSize);
    }

    @GetMapping("/delete")
    @Override
    public ProductSize delete(@RequestParam("id") String id) {
        return itemSizeService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<ProductSize> readAll() {
        return itemSizeService.readAll();
    }
    @GetMapping("/readWithItem")
    public List<ProductSize> productSizeList(@RequestParam("id") String itemId){
        return itemSizeService.productSizeList(itemId);
    }
}
