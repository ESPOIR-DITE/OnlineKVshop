package com.etoiledespoir.onlinekvshop.service.item.braind;

import com.etoiledespoir.onlinekvshop.domain.item.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.repository.item.braind.ItemBraindRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
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
        ItemBraind itemBraind1=read(itemBraind.getId());
        if (itemBraind1!=null){
            delete(itemBraind.getId());
            return itemBraindRep.save(itemBraind);
        }
       return null;
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

    public ItemBraind readWithItemId(String ItemId){
        for(ItemBraind itemBraind:readAll()){
            if(itemBraind.getItemId().equals(ItemId)){
                return itemBraind;
            }
        }return null;
    }
}
