package com.etoiledespoir.onlinekvshop.controller.pictures;

import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import com.etoiledespoir.onlinekvshop.service.pictures.Item_PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/OKVS/itemPicture")
public class ItemPictureController {
    @Autowired
    Item_PicturesService item_picturesService;
    @GetMapping("/read")
    public List<Item_Pictures> images(@RequestParam("id") String id){
        return item_picturesService.readAllFileOf(id);
    }
    @GetMapping("/readWithImageId")
    public Item_Pictures getWithImageId(@RequestParam("id") String id){
        return item_picturesService.getWithImageId(id);
    }
}
