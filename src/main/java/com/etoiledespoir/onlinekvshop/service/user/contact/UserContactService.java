package com.etoiledespoir.onlinekvshop.service.user.contact;

import com.etoiledespoir.onlinekvshop.domain.user.contact.UserContact;
import com.etoiledespoir.onlinekvshop.repository.user.contact.UserContactRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserContactService implements Iservice<UserContact,String> {
    @Autowired
    private UserContactRep userContactRep;
    private static UserContactService userContactService;

    private UserContactService() {
    }
    public static UserContactService getUserContactService(){
        if(userContactService ==null){
            userContactService =new UserContactService();
        }return userContactService;
    }

    @Override
    public UserContact creat(UserContact userContact) {
        return userContactRep.save(userContact);
    }

    @Override
    public UserContact delete(String id) {
        Optional<UserContact> result= userContactRep.findById(id);
        userContactRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public UserContact Update(UserContact userContact) {
        return userContactRep.save(userContact);
    }

    @Override
    public UserContact read(String id) {
        Optional<UserContact> result= userContactRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<UserContact> readAll() {
        return userContactRep.findAll();
    }
}
