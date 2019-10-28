package com.etoiledespoir.onlinekvshop.service.braind;

import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.repository.braind.ItemBraindRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ItemBraindService implements Iservice<ItemBraind,String> {
    @Autowired
    private ItemBraindRep itemBraindRep;
    private static ItemBraindService itemBraindService;

    private ItemBraindService() {
    }
    public static ItemBraindService getItemBraindService(){
        if(itemBraindService==null){
            itemBraindService=new ItemBraindService();
        }return itemBraindService;
    }

    @Override
    public ItemBraind creat(ItemBraind itemBraind) {
        return itemBraindRep.save(itemBraind);
    }

    @Override
    public ItemBraind delete(String id) {
        Optional<ItemBraind> result=itemBraindRep.findById(id);
        itemBraindRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemBraind Update(ItemBraind itemBraind) {
        return itemBraindRep.save(itemBraind);
    }

    @Override
    public ItemBraind read(String id) {
        Optional<ItemBraind> result=itemBraindRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemBraind> readAll() {
        return itemBraindRep.findAll();
    }
}
