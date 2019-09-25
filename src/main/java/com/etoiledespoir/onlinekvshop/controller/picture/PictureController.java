package com.etoiledespoir.onlinekvshop.controller.picture;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.Payment;
import com.etoiledespoir.onlinekvshop.domain.Pictures2;
import com.etoiledespoir.onlinekvshop.service.picture.impl.PictureService;
import org.atmosphere.config.service.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "OKVS/picture")
public class PictureController implements Icontroller<Pictures2,String> {
    @Autowired
    PictureService pictureService;


    @PostMapping("/creat")
    @Override
    public Pictures2 create(@RequestBody Pictures2 pictures2) {
        return pictureService.creat(pictures2);
    }

    @GetMapping("/read")
    @Override
    public Pictures2 read(@RequestParam(value = "id") String id) {
        System.out.println("in reading picture");
        return pictureService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Pictures2 update(@RequestBody Pictures2 pictures2) {
        return pictureService.Update(pictures2);
    }

    @GetMapping("/delete")
    @Override
    public Pictures2 delete(@RequestParam(value = "id") String id) {
        return pictureService.delete(id);
    }

    @Override
    public ArrayList<String> readAll() {
     return null;
    }
    @GetMapping("/readAll")
    public ArrayList<Pictures2> getAll(){
        return pictureService.getAll();
    }
    @GetMapping("/readpic")
    public Image readIcon(@RequestParam(value = "id") String id){
        return pictureService.read(id).getImage();
    }
}
