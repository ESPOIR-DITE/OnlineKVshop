package com.etoiledespoir.onlinekvshop.service.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ProductType;
import com.etoiledespoir.onlinekvshop.repository.product.ProductTypeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductTypeservice implements Iservice<ProductType,String> {
    @Autowired
    ProductTypeRepo productTypeRepo;
    private static ProductTypeservice productTypeservice;

    private ProductTypeservice() {
    }
    public static ProductTypeservice getProductTypeservice(){
        if(productTypeservice==null){
            productTypeservice=new ProductTypeservice();
        }return productTypeservice;
    }

    @Override
    public ProductType creat(ProductType productType) {
        return productTypeRepo.save(productType);
    }

    @Override
    public ProductType delete(String id) {
        Optional<ProductType> result=productTypeRepo.findById(id);
        productTypeRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ProductType Update(ProductType productType) {
        return productTypeRepo.save(productType);
    }

    @Override
    public ProductType read(String id) {
        Optional<ProductType> result=productTypeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ProductType> readAll() {
        return productTypeRepo.findAll();
    }
}
