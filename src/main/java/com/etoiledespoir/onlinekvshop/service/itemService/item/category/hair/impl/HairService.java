package com.etoiledespoir.onlinekvshop.service.itemService.item.category.hair.impl;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Hair;
import com.etoiledespoir.onlinekvshop.repository.item.category.hair.HairRepInt;
import com.etoiledespoir.onlinekvshop.repository.item.category.hair.impl.HairRepository;
import com.etoiledespoir.onlinekvshop.service.itemService.item.category.hair.HairServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HairService implements HairServiceInt {
private static HairService hairService;
@Autowired
    HairRepInt hairRepInt;
    private HairService() {
    }

    public static HairService getHairService(){
        if(hairService==null){
            hairService=new HairService();
        }return hairService;
    }
    @Override
    public Hair creat(Hair hair) {
        return hairRepInt.save(hair);
    }

    @Override
    public Hair delete(String id) {
        Optional<Hair> myhair=hairRepInt.findById(id);
        if(myhair==null){
            hairService.delete(id);
        }
        return myhair.orElse(null);
    }

    @Override
    public Hair Update(Hair hair) {
        return hairRepInt.save(hair);
    }

    @Override
    public Hair read(String id) {
        Optional<Hair> myhair=hairRepInt.findById(id);
        return myhair.orElse(null);

    }

    @Override
    public List<Hair> readAll() {

        return hairRepInt.findAll();
    }
}