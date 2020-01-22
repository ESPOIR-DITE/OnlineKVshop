package com.etoiledespoir.onlinekvshop.controller.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ProductType;
import com.etoiledespoir.onlinekvshop.service.product.ProductTypeservice;
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
    ProductTypeservice productTypeservice;
    @GetMapping("/read")
    public ProductType read(@RequestParam("id") String id){
        return productTypeservice.readWithTypeId(id);
    }
    @GetMapping("/reads")
    public List<ProductType> reads(){
        return productTypeservice.readAll();
    }
    @GetMapping("readAll")
    public List<ProductType> readAllOf(@RequestParam("id") String id){
        return productTypeservice.readAllOf(id);
    }

}
