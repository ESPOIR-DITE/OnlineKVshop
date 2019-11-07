package com.etoiledespoir.onlinekvshop.service.productType;

import com.etoiledespoir.onlinekvshop.domain.itemType.ItemType;
import com.etoiledespoir.onlinekvshop.repository.product.ProductRepo;
import com.etoiledespoir.onlinekvshop.repository.productType.ProductTypeRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ItemTypeService implements Iservice<ItemType,String> {
    @Autowired
    private ProductTypeRepository productRepo;
    private static ItemTypeService productTypeService;

    private ItemTypeService() {

    }
    public static ItemTypeService getProductTypeService(){
        if(productTypeService==null){
            productTypeService=new ItemTypeService();
        }return productTypeService;
    }

    @Override
    public ItemType creat(ItemType itemType) {
        return productRepo.save(itemType);
    }

    @Override
    public ItemType delete(String id) {
        Optional<ItemType> result=productRepo.findById(id);
        productRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemType Update(ItemType itemType) {
        return productRepo.save(itemType);
    }

    @Override
    public ItemType read(String id) {
        Optional<ItemType> result=productRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemType> readAll() {
        return productRepo.findAll();
    }
}
