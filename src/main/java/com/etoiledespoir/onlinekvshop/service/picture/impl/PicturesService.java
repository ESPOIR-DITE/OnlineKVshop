package com.etoiledespoir.onlinekvshop.service.picture.impl;

import com.etoiledespoir.onlinekvshop.domain.Pictures2;
import com.etoiledespoir.onlinekvshop.repository.picture2.pictureImpl.pictureImpl.PictureRep2;
import com.etoiledespoir.onlinekvshop.service.picture.PictureInt;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PicturesService{}/** implements PictureInt {
    private PictureRep2 pictureRep2= PictureFactory.getPicture();
    private static PictureService pictureService=null;

    public PictureService() {
    }
    public static PictureService getPictureService(){
        if(pictureService==null){
            pictureService=new PictureService();
        }return pictureService;
    }

    @Override
    public Pictures2 creat(Pictures2 pictures2) {
        return pictureRep2.creat(pictures2);
    }

    @Override
    public Pictures2 delete(String id) {
        return pictureRep2.delete(id);
    }

    @Override
    public Pictures2 Update(Pictures2 pictures2) {
        return pictureRep2.Update(pictures2);
    }

    @Override
    public Pictures2 read(String id) {
        return pictureRep2.read(id);
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public String getPremier() {
        return null;
    }

    public ArrayList<Pictures2> getAll(){
        return pictureRep2.getAll();
    }

}
*/