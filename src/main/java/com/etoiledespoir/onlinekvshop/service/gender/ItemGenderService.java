package com.etoiledespoir.onlinekvshop.service.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import com.etoiledespoir.onlinekvshop.repository.gender.ItemGenderRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemGenderService implements Iservice<ItemGender,String> {
    @Autowired
    private ItemGenderRep itemGenderRep;
    private static ItemGenderService itemGenderService;

    private ItemGenderService() {
    }
    public static ItemGenderService getItemGenderService(){
        if(itemGenderService==null){
            itemGenderService=new ItemGenderService();
        }return itemGenderService;
    }

    @Override
    public ItemGender creat(ItemGender itemGender) {
        return itemGenderRep.save(itemGender);
    }

    @Override
    public ItemGender delete(String id) {
        Optional<ItemGender>result=itemGenderRep.findById(id);
        itemGenderRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemGender Update(ItemGender itemGender) {
        return itemGenderRep.save(itemGender);
    }

    @Override
    public ItemGender read(String id) {
        Optional<ItemGender>result=itemGenderRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemGender> readAll() {
        return itemGenderRep.findAll();
    }
    public ItemGender readWithItemId(String ItemId){
        for(ItemGender itemGender:readAll()){
            if(itemGender.getItemId().equals(ItemId)){
                return itemGender;
            }
        }return null;
    }
}
