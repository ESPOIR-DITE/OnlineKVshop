package com.etoiledespoir.onlinekvshop.service.color;

import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.repository.color.ItemColorRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ItemColorService implements Iservice<ItemColor,String> {
    @Autowired
    ItemColorRep itemColorRep;
    private static ItemColorService itemColorService=null;

    private ItemColorService() {
    }
    public static ItemColorService getItemColorService(){
        if(itemColorService==null){
            itemColorService=new ItemColorService();
        }return itemColorService;
    }

    @Override
    public ItemColor creat(ItemColor itemColor) {
        return itemColorRep.save(itemColor);
    }

    @Override
    public ItemColor delete(String id) {
        Optional<ItemColor> result=itemColorRep.findById(id);
        itemColorRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemColor Update(ItemColor itemColor) {
        return itemColorRep.save(itemColor);
    }

    @Override
    public ItemColor read(String id) {
        Optional<ItemColor> result=itemColorRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemColor> readAll() {
        return itemColorRep.findAll();
    }
}
