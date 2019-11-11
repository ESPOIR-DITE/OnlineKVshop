package com.etoiledespoir.onlinekvshop.controller.product;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.factory.domain.product.ProductFactory;
import com.etoiledespoir.onlinekvshop.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("OKVS/product")
public class ProductController implements Icontroller<Products,String> {
    @Autowired
    ProductService productService;
    @PostMapping("/create")
    @Override
    public Products create(@RequestBody Products products) {
        Products products1= ProductFactory.getProduct(products.getName(),products.getDescription());
        return productService.creat(products1);
    }
    @GetMapping("/read")
    @Override
    public Products read(@RequestParam("id") String id) {
        return productService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Products update(@RequestBody Products products) {
        return productService.Update(products);
    }
    @GetMapping("/delete")
    @Override
    public Products delete(@RequestParam("id") String id) {
        return productService.delete(id);
    }
    @GetMapping("/reads")
    @Override
    public List<Products> readAll() {
        return productService.readAll();
    }
}
