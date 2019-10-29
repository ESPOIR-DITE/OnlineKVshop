package com.etoiledespoir.onlinekvshop.service.pictures;

import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import com.etoiledespoir.onlinekvshop.repository.pictures.Item_pictureRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Item_PicturesService implements Iservice<Item_Pictures,String> {
private static Item_PicturesService item_picturesService;
@Autowired
private Item_pictureRepository ipr;
public static Item_PicturesService getItem_picturesService(){
    if(item_picturesService==null){
        return item_picturesService=new Item_PicturesService();
    }return item_picturesService;
}

    @Override
    public Item_Pictures creat(Item_Pictures item_pictures) {
        return ipr.save(item_pictures);
    }

    @Override
    public Item_Pictures delete(String id) {
    Optional<Item_Pictures> result=ipr.findById(id);
        ipr.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Item_Pictures Update(Item_Pictures item_pictures) {
        return ipr.save(item_pictures);
    }

    @Override
    public Item_Pictures read(String id) {
        Optional<Item_Pictures> result=ipr.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Item_Pictures> readAll() {
        return ipr.findAll();
    }

    public List<Item_Pictures> readAllFileOf(String itemId){
    List<Item_Pictures>toReturn=new ArrayList<>();
    List<Item_Pictures>result=ipr.findAll();
    for(Item_Pictures item_pictures: result){
        if(item_pictures.getItemId().equals(itemId)){
            toReturn.add( item_pictures);
        }
    }return toReturn;
    }
}