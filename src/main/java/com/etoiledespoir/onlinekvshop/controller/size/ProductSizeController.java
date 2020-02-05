package com.etoiledespoir.onlinekvshop.controller.size;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.size.ProductSize;
import com.etoiledespoir.onlinekvshop.factory.domain.size.ItemSizeFactory;
import com.etoiledespoir.onlinekvshop.service.size.ItemSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/deleteAllOf")
    public Boolean deleteAllOf(@RequestParam("productId")String productId){
        return itemSizeService.deleteAllOf(productId);
    }
    @PostMapping("/createAll")
    public Boolean createAll(@RequestBody ArrayList<ProductSize> productType){
        ArrayList<ProductSize> toSend=new ArrayList<>();
        for(ProductSize productT:productType ){
            ProductSize productSize= ItemSizeFactory.getProductSize(productT.getSizeId(),productT.getItemId());
            toSend.add(productSize);
        }
        return itemSizeService.createAll(toSend);
    }
}
