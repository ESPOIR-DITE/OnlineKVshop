package com.etoiledespoir.onlinekvshop.service.itemSold.impl;

import com.etoiledespoir.onlinekvshop.domain.itemSold.ItemSold;
import com.etoiledespoir.onlinekvshop.repository.itemsold.ItemSoldInt;
import com.etoiledespoir.onlinekvshop.service.itemSold.ItemSoldServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemSoldService implements ItemSoldServiceInt {
    private static ItemSoldService itemSoldService;
    @Autowired
    ItemSoldInt itemSoldInt;

    private ItemSoldService() {
    }
    public static ItemSoldService getItemSoldService(){
        if(itemSoldService==null){
            itemSoldService=new ItemSoldService();
        }return itemSoldService;
    }

    @Override
    public ItemSold creat(ItemSold itemSold) {
        return itemSoldInt.save(itemSold);
    }

    @Override
    public ItemSold delete(String id) {
        Optional<ItemSold> myItemsold=itemSoldInt.findById(id);
        if(myItemsold!=null){
            itemSoldInt.deleteById(id);
        }
        return myItemsold.orElse(null);
    }

    @Override
    public ItemSold Update(ItemSold itemSold) {
        return itemSoldInt.save(itemSold);
    }

    @Override
    public ItemSold read(String id) {
        Optional<ItemSold> myItemsold=itemSoldInt.findById(id);
        return myItemsold.orElse(null);
    }

    @Override
    public List<ItemSold> readAll() {
        return itemSoldInt.findAll();
    }
}
