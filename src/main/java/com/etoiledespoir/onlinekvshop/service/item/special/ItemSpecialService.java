package com.etoiledespoir.onlinekvshop.service.item.special;

import com.etoiledespoir.onlinekvshop.domain.item.specials.ItemSpecial;
import com.etoiledespoir.onlinekvshop.repository.item.special.ItemSpecialRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ItemSpecialService implements Iservice<ItemSpecial,String> {
    @Autowired
    ItemSpecialRepo itemSpecialRepo;
    private static ItemSpecialService itemSpecialService=null;
    private ItemSpecialService(){}
    public static ItemSpecialService getItemSpecialService(){
        if(itemSpecialService==null){
            itemSpecialService=new ItemSpecialService();
        }return itemSpecialService;
    }

    @Override
    public ItemSpecial creat(ItemSpecial itemSpecial) {
        return itemSpecialRepo.save(itemSpecial);
    }

    @Override
    public ItemSpecial delete(String id) {
        Optional<ItemSpecial> result=itemSpecialRepo.findById(id);
         itemSpecialRepo.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemSpecial Update(ItemSpecial itemSpecial) {
        return itemSpecialRepo.save(itemSpecial);
    }

    @Override
    public ItemSpecial read(String id) {
        Optional<ItemSpecial> result=itemSpecialRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemSpecial> readAll() {
        return itemSpecialRepo.findAll();
    }
}
