package com.etoiledespoir.onlinekvshop.service.mypic.impl;

import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;
import com.etoiledespoir.onlinekvshop.repository.pic.MypicInt;
import com.etoiledespoir.onlinekvshop.service.mypic.PictureServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PictureService implements PictureServiceInt {
    private static PictureService pictureService;
    @Autowired
    MypicInt mypicInt;

    private PictureService() {
    }

    public static PictureService getPictureService() {
        if(pictureService==null){
            pictureService=new PictureService();
        }
        return pictureService;
    }

    @Override
    public Mypic creat(Mypic mypic) {
        return mypicInt.save(mypic);
    }

    @Override
    public Mypic delete(String id) {
        Optional<Mypic> pic=mypicInt.findById(id);
        if(pic!=null){
            mypicInt.deleteById(id);
        }
        return pic.orElse(null);
    }

    @Override
    public Mypic Update(Mypic mypic) {
        return mypicInt.save(mypic);
    }

    @Override
    public Mypic read(String id) {
        Optional<Mypic> pic=mypicInt.findById(id);
        return pic.orElse(null);
    }
    public Mypic findPictureByItemId(String itemId){
        List<Mypic>pic=mypicInt.findAll();
        for (Mypic mypic : pic) {
            if (mypic.getItemId().equalsIgnoreCase(itemId)) return mypic;
        }return null;
    }

    @Override
    public List<Mypic> readAll() {
        return mypicInt.findAll();
    }
}
