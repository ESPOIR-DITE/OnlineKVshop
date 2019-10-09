package com.etoiledespoir.onlinekvshop.service.picture3.impl;

import com.etoiledespoir.onlinekvshop.domain.Pictures2;
import com.etoiledespoir.onlinekvshop.repository.picture3.impl.PictureForWeb;
import com.etoiledespoir.onlinekvshop.service.picture3.PictureServForWebInt;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.ArrayList;
@Component
public class PictureServiceForWeb{}/** implements PictureServForWebInt {

    Image Image=null;
    private PictureForWeb pictureForWeb= PictureServForWebFactory.getPictureForWeb();

    private static PictureServiceForWeb pictureRep=null;
    private PictureServiceForWeb(){

    }
    public static PictureServiceForWeb getPictureRep(){
        if(pictureRep==null){
            pictureRep =new PictureServiceForWeb();
        }return pictureRep;
    }
    @Override
    public Pictures2 creat(Pictures2 picture) {

        return pictureForWeb.creat(picture);
    }

    @Override
    public Pictures2 delete(String id) {
        return pictureForWeb.delete(id) ;
    }

    @Override
    public Pictures2 Update(Pictures2 picture) {
        return null;
    }

    public Image getImage(){
        return Image;
    }
    @Override
    public Pictures2 read(String id) {
        return pictureForWeb.read(id);
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }
    public ArrayList<Pictures2> getAll(){
        return pictureForWeb.getAll();
    }

    @Override
    public String getPremier() {
        return null;
    }

}

*/