package com.etoiledespoir.onlinekvshop.service.itemService.category.cloths.impl;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Cloths;
import com.etoiledespoir.onlinekvshop.repository.item.category.cloths.ClothsRepInt;
import com.etoiledespoir.onlinekvshop.service.itemService.category.cloths.ClothsServiceInt;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClothsService implements ClothsServiceInt {
    private static ClothsService clothsService=null;
    @Autowired
    ClothsRepInt clothsRep;

    private ClothsService() {
    }
    public static ClothsService getClothsRep(){
        if(clothsService==null){
            clothsService=new ClothsService();
        }return clothsService;
    }


    @Override
    public Cloths creat(Cloths cloths) {
        return clothsRep.save(cloths);
    }

    @Override
    public Cloths delete(String id) {
        Optional<Cloths> mycloths=clothsRep.findById(id);
        if(mycloths!=null){
            clothsRep.deleteById(id);
        }
        return mycloths.orElse(null);
    }

    @Override
    public Cloths Update(Cloths cloths) {
        return clothsRep.save(cloths);
    }

    @Override
    public Cloths read(String id) {
        Optional<Cloths> mycloths=clothsRep.findById(id);
        return mycloths.orElse(null);
    }

    @Override
    public List<Cloths> readAll() {
        return clothsRep.findAll();
    }
}