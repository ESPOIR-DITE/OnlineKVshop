package com.etoiledespoir.onlinekvshop.service.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.repository.product.ProductRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService implements Iservice<Products,String> {
    @Autowired
    private ProductRepo productRepo;
    private static ProductService productService;
    private ProductService(){}
    public static ProductService getProductService(){
        if(productService==null){
            productService=new ProductService();
        }return productService;
    }
    @Override
    public Products creat(Products products) {
        return productRepo.save(products);
    }

    @Override
    public Products delete(String id) {
        Optional<Products>result=productRepo.findById(id);
        productRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Products Update(Products products) {
        return productRepo.save(products);
    }

    @Override
    public Products read(String id) {
        Optional<Products>result=productRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Products> readAll() {
        return productRepo.findAll();
    }
}
