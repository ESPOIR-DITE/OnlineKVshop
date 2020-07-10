package com.etoiledespoir.onlinekvshop.service.item.braind;

import com.etoiledespoir.onlinekvshop.domain.item.braind.ItemBrand;
import com.etoiledespoir.onlinekvshop.repository.item.braind.ItemBraindRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ItemBraindService implements Iservice<ItemBrand,String> {
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
    public ItemBrand creat(ItemBrand itemBrand) {
        return itemBraindRep.save(itemBrand);
    }

    @Override
    public ItemBrand delete(String id) {
        Optional<ItemBrand> result=itemBraindRep.findById(id);
        itemBraindRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemBrand Update(ItemBrand itemBrand) {
        ItemBrand itemBrand1 =read(itemBrand.getId());
        if (itemBrand1 !=null){
            delete(itemBrand.getId());
            return itemBraindRep.save(itemBrand);
        }
       return null;
    }

    @Override
    public ItemBrand read(String id) {
        Optional<ItemBrand> result=itemBraindRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemBrand> readAll() {
        return itemBraindRep.findAll();
    }

    public ItemBrand readWithItemId(String ItemId){
        for(ItemBrand itemBrand :readAll()){
            if(itemBrand.getItemId().equals(ItemId)){
                return itemBrand;
            }
        }return null;
    }
}
