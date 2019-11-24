package com.etoiledespoir.onlinekvshop.service.pictures;

import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.repository.pictures.ImagesRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * this class will be helping the creation of the images of each item thet we will be adding to database
 * each item may have one or many pictures.
 */

@Service
public class ImagesService implements Iservice<Images,String> {
    private static ImagesService imagesService;
    @Autowired
    private ImagesRepository ir;

    private ImagesService() {
    }
    public static ImagesService getImagesService(){
        if(imagesService==null){
             imagesService=new ImagesService();
        }return imagesService;
    }

    @Override
    public Images creat(Images images) {
        return ir.save(images);
    }

    @Override
    public Images delete(String id) {
        Optional<Images> result=ir.findById(id);
        ir.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Images Update(Images images) {
        return ir.save(images);
    }

    @Override
    public Images read(String id) {
        Optional<Images> result=ir.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Images> readAll() {
        return ir.findAll();
    }
    public List<Images> readFiles(String imageId){
        List<Images>reserve=new ArrayList<>();
        List<Images>images=ir.findAll();
        for (Images images1: images){
            if(images1.getId().equals(imageId)){
                reserve.add(images1);
            }
        }
        return reserve;
    }
}
