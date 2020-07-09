package com.etoiledespoir.onlinekvshop.service.item.items.impl;

import com.etoiledespoir.onlinekvshop.domain.item.Items;
import com.etoiledespoir.onlinekvshop.repository.item.ItemRepository;
import com.etoiledespoir.onlinekvshop.service.item.items.ItemServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService implements ItemServiceInt {
    private static ItemService itemService;
    @Autowired
    private ItemRepository itemRepository;

    private ItemService() {
    }

    public static ItemService getItemService(){
        if(itemService ==null){
            itemService =new ItemService();
        }return itemService;
    }
    @Override
    public Items creat(Items items) {
        return itemRepository.save(items);
    }

    @Override
    public Items delete(String id) {
        Items myItem= get(id);
        if(myItem!=null){
            itemRepository.deleteById(id);
            return myItem;
        }
        return null;
    }

    @Override
    public Items Update(Items items) {
        Items myItem= get(items.getId());
        if(myItem!=null){
            itemRepository.delete(myItem);
            return creat(items);
        }
        return null;
    }

    @Override
    public Items read(String id) {
        return get(id);
    }
    public Items get(String id){
        Optional<Items> myItem= itemRepository.findById(id);
        return myItem.orElse(null);
    }

    @Override
    public List<Items> readAll() {
        return itemRepository.findAll();
    }
}
