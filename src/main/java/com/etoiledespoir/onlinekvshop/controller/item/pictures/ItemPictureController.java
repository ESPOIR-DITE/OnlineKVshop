package com.etoiledespoir.onlinekvshop.controller.item.pictures;

import com.etoiledespoir.onlinekvshop.domain.generic.item_picture.itemImage;
import com.etoiledespoir.onlinekvshop.service.item.pictures.ItemImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OKVS/itemPicture")
public class ItemPictureController {
    @Autowired
    ItemImageService item_picturesService;
    @GetMapping("/read")
    public List<itemImage> images(@RequestParam("id") String id){
        return item_picturesService.readAllFileOf(id);
    }
    @GetMapping("/readWithImageId")
    public itemImage getWithImageId(@RequestParam("id") String id){
        return item_picturesService.getWithImageId(id);
    }
}
