package com.etoiledespoir.onlinekvshop.service.item.sold.impl;

import com.etoiledespoir.onlinekvshop.domain.item.itemSold.ItemSold;
import com.etoiledespoir.onlinekvshop.repository.item.itemsold.ItemSoldRepository;
import com.etoiledespoir.onlinekvshop.service.item.sold.ItemSoldServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemSoldService implements ItemSoldServiceInt {
    private static ItemSoldService itemSoldService;
    @Autowired
    ItemSoldRepository itemSoldRepository;

    private ItemSoldService() {
    }
    public static ItemSoldService getItemSoldService(){
        if(itemSoldService==null){
            itemSoldService=new ItemSoldService();
        }return itemSoldService;
    }

    @Override
    public ItemSold creat(ItemSold itemSold) {
        return itemSoldRepository.save(itemSold);
    }

    @Override
    public ItemSold delete(String id) {
        Optional<ItemSold> myItemsold= itemSoldRepository.findById(id);
        if(myItemsold!=null){
            itemSoldRepository.deleteById(id);
        }
        return myItemsold.orElse(null);
    }

    @Override
    public ItemSold Update(ItemSold itemSold) {
        return itemSoldRepository.save(itemSold);
    }

    @Override
    public ItemSold read(String id) {
        Optional<ItemSold> myItemsold= itemSoldRepository.findById(id);
        return myItemsold.orElse(null);
    }

    @Override
    public List<ItemSold> readAll() {
        return itemSoldRepository.findAll();
    }
}
