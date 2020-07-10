package com.etoiledespoir.onlinekvshop.service.item.image;

import com.etoiledespoir.onlinekvshop.domain.item.image.itemImage;
import com.etoiledespoir.onlinekvshop.repository.item.pictures.Item_pictureRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemImageService implements Iservice<itemImage,String> {
private static ItemImageService item_picturesService;
@Autowired
private Item_pictureRepository ipr;
public static ItemImageService getItem_picturesService(){
    if(item_picturesService==null){
        return item_picturesService=new ItemImageService();
    }return item_picturesService;
}

    @Override
    public itemImage creat(itemImage item_pictures) {
        return ipr.save(item_pictures);
    }

    @Override
    public itemImage delete(String id) {
    Optional<itemImage> result=ipr.findById(id);
        ipr.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public itemImage Update(itemImage item_pictures) {
        return ipr.save(item_pictures);
    }

    @Override
    public itemImage read(String id) {
        Optional<itemImage> result=ipr.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<itemImage> readAll() {
        return ipr.findAll();
    }

    /**
     * this method returns all the item_pictures of a specific itemId
     * item_picture contains itemPiscture id and item id
     * @param itemId
     * @return
     */
    public List<itemImage> readAllFileOf(String itemId){
    List<itemImage>toReturn=new ArrayList<>();
    List<itemImage>result=ipr.findAll();
    for(itemImage item_pictures: result){
        if(item_pictures.getItemId().equals(itemId)){
            toReturn.add( item_pictures);
        }
    }return toReturn;
    }
    public itemImage getItemPicture(String itemId){
        for(itemImage item_pictures: readAll()){
            if(item_pictures.getItemId().equals(itemId)){
               return item_pictures;
            }
        }
        return null;
    }
    public itemImage getWithImageId(String imageId){
        for(itemImage item_pictures: readAll()){
            if(item_pictures.getImageId().equals(imageId)){
                return item_pictures;
            }
        }
        return null;
    }
}