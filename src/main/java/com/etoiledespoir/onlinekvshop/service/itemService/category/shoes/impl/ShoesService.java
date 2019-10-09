package com.etoiledespoir.onlinekvshop.service.itemService.category.shoes.impl;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Shoes;
import com.etoiledespoir.onlinekvshop.repository.item.category.shoes.ShoeasRepInt;
import com.etoiledespoir.onlinekvshop.service.itemService.category.shoes.ShoeasServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoesService implements ShoeasServiceInt {
    private static ShoesService shoesService;
    @Autowired
    ShoeasRepInt shoeasRepInt;
    private ShoesService() {
    }

    public static ShoesService getShoesService() {
        if(shoesService==null){
            shoesService=new ShoesService();
        }
        return shoesService;
    }

    @Override
    public Shoes creat(Shoes shoes) {
        return shoeasRepInt.save(shoes);
    }

    @Override
    public Shoes delete(String id) {
        Optional<Shoes> myShoes=shoeasRepInt.findById(id);
        if(myShoes==null){
            shoeasRepInt.deleteById(id);
        }
        return myShoes.orElse(null);
    }

    @Override
    public Shoes Update(Shoes shoes) {
        return shoeasRepInt.save(shoes);
    }

    @Override
    public Shoes read(String id) {
        Optional<Shoes> myShoes=shoeasRepInt.findById(id);
        return myShoes.orElse(null);
    }

    @Override
    public List<Shoes> readAll() {
        return shoeasRepInt.findAll();
    }
}