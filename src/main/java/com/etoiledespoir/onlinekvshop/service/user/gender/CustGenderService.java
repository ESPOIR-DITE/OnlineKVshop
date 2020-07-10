package com.etoiledespoir.onlinekvshop.service.user.gender;

import com.etoiledespoir.onlinekvshop.domain.user.gender.UserGender;
import com.etoiledespoir.onlinekvshop.repository.user.gender.UserGenderRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustGenderService implements Iservice<UserGender,String> {
    @Autowired
    UserGenderRep userGenderRep;
    private static CustGenderService custGenderService;

    private CustGenderService() {
    }
    public static CustGenderService getCustGenderService(){
        if(custGenderService==null){
            custGenderService=new CustGenderService();
        }return custGenderService;
    }

    @Override
    public UserGender creat(UserGender userGender) {
        return userGenderRep.save(userGender);
    }

    @Override
    public UserGender delete(String id) {
        Optional<UserGender> result= userGenderRep.findById(id);
        userGenderRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public UserGender Update(UserGender userGender) {
        return userGenderRep.save(userGender);
    }

    @Override
    public UserGender read(String id) {
        Optional<UserGender> result= userGenderRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<UserGender> readAll() {
        return userGenderRep.findAll();
    }
}
