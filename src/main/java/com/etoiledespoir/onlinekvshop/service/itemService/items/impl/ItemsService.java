package com.etoiledespoir.onlinekvshop.service.itemService.items.impl;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.Items;
import com.etoiledespoir.onlinekvshop.repository.item.items.ItemRepInt;
import com.etoiledespoir.onlinekvshop.service.itemService.items.ItemServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemsService implements ItemServiceInt {
    private static ItemsService itemsService;
    @Autowired
    private ItemRepInt itemRepInt;

    private ItemsService() {
    }

    public static ItemsService getItemsService(){
        if(itemsService==null){
            itemsService=new ItemsService();
        }return itemsService;
    }
    @Override
    public Items creat(Items items) {
        return itemRepInt.save(items);
    }

    @Override
    public Items delete(String id) {
        Optional<Items> myItem=itemRepInt.findById(id);
        if(myItem==null){
            itemRepInt.deleteById(id);
        }
        return myItem.orElse(null);
    }

    @Override
    public Items Update(Items items) {
        return itemRepInt.save(items);
    }

    @Override
    public Items read(String id) {
        Optional<Items> myItem=itemRepInt.findById(id);
        return myItem.orElse(null);
    }

    @Override
    public List<Items> readAll() {
        return itemRepInt.findAll();
    }
}
