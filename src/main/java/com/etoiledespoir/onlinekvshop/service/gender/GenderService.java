package com.etoiledespoir.onlinekvshop.service.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.Gender;
import com.etoiledespoir.onlinekvshop.repository.gender.GenderRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService implements Iservice<Gender,String> {
    @Autowired
    private GenderRepository genderRepository;
    private static GenderService genderService;

    private GenderService() {
    }
    public static GenderService getGenderService(){
        if(genderService==null){
            genderService=new GenderService();
            } return genderService;
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
        return result.orElse(null);
    }
    public Gender readWithGender(String gender){
        List<Gender>result=genderRepository.findAll();
        for(Gender gender1: result){
            if(gender1.equals(gender1)){
                return gender1;
            }
        }
        return null;
    }

    @Override
    public List<Gender> readAll() {
        return genderRepository.findAll();
    }

}
