package com.etoiledespoir.onlinekvshop.service.item.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ItemType;
import com.etoiledespoir.onlinekvshop.repository.item.product.ProductTypeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ItemTypeService implements Iservice<ItemType,String> {
    @Autowired
    ProductTypeRepo productTypeRepo;
    private static ItemTypeService itemTypeService;

    private ItemTypeService() {
    }
    public static ItemTypeService getItemTypeService(){
        if(itemTypeService ==null){
            itemTypeService =new ItemTypeService();
        }return itemTypeService;
    }

    @Override
    public ItemType creat(ItemType itemType) {
        return productTypeRepo.save(itemType);
    }

    @Override
    public ItemType delete(String id) {
        Optional<ItemType> result=productTypeRepo.findById(id);
        productTypeRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemType Update(ItemType itemType) {
        return productTypeRepo.save(itemType);
    }

    @Override
    public ItemType read(String id) {
        Optional<ItemType> result=productTypeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemType> readAll() {
        return productTypeRepo.findAll();
    }

    public ItemType readWithTypeId(String typeId){
        for(ItemType itemType : readAll()){
            if(itemType.getTypeId().equals(typeId)){
                return itemType;
            }
        }
        return null;
    }

    public List<ItemType> readAllOf(String typeId){
        List<ItemType> itemTypeList =new ArrayList<>();
        for(ItemType itemType : readAll()){
            if(itemType.getTypeId().equals(typeId)){
                itemTypeList.add(itemType);
            }
        }
        return itemTypeList;
    }
}
