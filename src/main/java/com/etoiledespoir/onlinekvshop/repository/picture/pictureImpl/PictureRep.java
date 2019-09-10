package com.etoiledespoir.onlinekvshop.repository.picture.pictureImpl;

import com.etoiledespoir.onlinekvshop.domain.Picture;
import com.etoiledespoir.onlinekvshop.repository.picture.PictureRepoInt;

import java.util.ArrayList;

public class PictureRep implements PictureRepoInt {
    private static PictureRep pictureRep=null;
    private PictureRep(){}
    public static PictureRep getPictureRep(){
        if(pictureRep==null){
            pictureRep =new PictureRep();
        }return pictureRep;
    }
    @Override
    public Picture creat(Picture picture) {
        return null;
    }

    @Override
    public Picture delete(String id) {
        return null;
    }

    @Override
    public Picture Update(Picture picture) {
        return null;
    }

    @Override
    public Picture read(String id) {
        return null;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public String getPremier() {
        return null;
    }
}
