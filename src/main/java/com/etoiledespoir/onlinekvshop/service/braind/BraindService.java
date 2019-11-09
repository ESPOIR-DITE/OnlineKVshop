package com.etoiledespoir.onlinekvshop.service.braind;

import com.etoiledespoir.onlinekvshop.domain.braind.Braind;
import com.etoiledespoir.onlinekvshop.repository.braind.BraindRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BraindService implements Iservice<Braind,String> {
    @Autowired
    private BraindRep braindRep;
    private static BraindService braindService;

    private BraindService() {
    }
    public static BraindService getBraindService(){
        if(braindService==null){
            braindService=new BraindService();
        }return braindService;
    }

    @Override
    public Braind creat(Braind braind) {
        return braindRep.save(braind);
    }

    @Override
    public Braind delete(String id) {
        Optional<Braind> result=braindRep.findById(id);
        braindRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Braind Update(Braind braind) {
        return braindRep.save(braind);
    }

    @Override
    public Braind read(String id) {
        Optional<Braind> result=braindRep.findById(id);
        return result.orElse(null);
    }
    public Braind readWithName(String name) {
       List<Braind> result=braindRep.findAll();
       for(Braind braind: result){
           if(braind.getBraindName().equals(name)){
               return braind;
           }
       }
        return null;
    }

    @Override
    public List<Braind> readAll() {
        return braindRep.findAll();
    }
}
