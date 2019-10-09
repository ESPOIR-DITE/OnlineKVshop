package com.etoiledespoir.onlinekvshop.service.user.impl;

import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;
import com.etoiledespoir.onlinekvshop.repository.user.GenderRepInt;
import com.etoiledespoir.onlinekvshop.service.user.GenderServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService implements GenderServiceInt {
    @Autowired
    GenderRepInt genderRepInt;
    private static GenderService genderService;

    private GenderService() {
    }

    public static GenderService getGenderService(){
        if(genderService==null){
            genderService=new GenderService();
        }return genderService;
    }
    @Override
    public Gender creat(Gender gender) {
        return genderRepInt.save(gender);
    }

    @Override
    public Gender delete(String id) {
        Optional<Gender> result=genderRepInt.findById(id);
        genderRepInt.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Gender Update(Gender gender) {
        return genderRepInt.save(gender);
    }

    @Override
    public Gender read(String id) {
        Optional<Gender> result=genderRepInt.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Gender> readAll() {
        return genderRepInt.findAll();
    }
}
