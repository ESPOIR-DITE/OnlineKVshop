package com.etoiledespoir.onlinekvshop.service.user.Demography.impl;

import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;
import com.etoiledespoir.onlinekvshop.repository.user.Demography.GenderRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import com.etoiledespoir.onlinekvshop.service.user.Demography.GenderServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService implements GenderServiceInt {
    @Autowired
    GenderRepository genderRepository;
    private static GenderService genderService;

    public GenderService() {
    }
    public static GenderService getGenderService(){
        if(genderService==null){
            genderService=new GenderService();
        }return genderService;
    }

    @Override
    public Gender creat(Gender gender) {
        return genderRepository.save(gender);
    }

    @Override
    public Gender delete(String id) {
        Optional<Gender> result=genderRepository.findById(id);
        genderRepository.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Gender Update(Gender gender) {
        return genderRepository.save(gender);
    }

    @Override
    public Gender read(String id) {
        Optional<Gender> result=genderRepository.findById(id);
        return result.orElse(null);    }

    @Override
    public List<Gender> readAll() {
        return genderRepository.findAll();
    }
}
