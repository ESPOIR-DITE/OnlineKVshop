package com.etoiledespoir.onlinekvshop.controller.itemController.categories.cloths;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.impl.cloths.Cloths;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.factory.domain.item.ClothsFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.service.itemService.category.cloths.impl.ClothsService;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/OKVS/cloths")
public class ClothsController implements Icontroller<Cloths, String> {
   @Autowired
    ClothsService clothsService;
   @Autowired
    PictureService pictureService;
   private boolean result=false;

   @PostMapping("/create")
    public Cloths createAll(@RequestParam("file") MultipartFile file,@RequestParam("itemName")String name, @RequestParam("itemType")String type, @RequestParam("size")String size, @RequestParam("marque")String marque, @RequestParam("gender")String gender, @RequestParam("desc")String desc, @RequestParam("color")String color) throws IOException {
       Cloths cloths= ClothsFactory.getCloths(name,type,size,marque,gender,desc,color);
        Cloths cloths1= clothsService.creat(cloths);
        if(cloths1!=null){
           result= pictureService.helpCreateFile(file,cloths1.getItemNumber());
           if(result==true){
               return cloths1;
           }

        }return null;
    }

    @Override
    public Cloths create(Cloths cloths) {
        return null;
    }

    @Override
    public Cloths read(String id) {
        return null;
    }

    @GetMapping("/read")
    public MypicHelpRead readWIthImage(@RequestParam("id") String id) {
       Cloths cloths= clothsService.read(id);
       if(cloths!=null) {
           String StringImage = pictureService.readFile(id);
           if(StringImage!=null||StringImage.equals("")){
               MypicHelpRead mypicHelpRead= MypicHelpReadFactory.getMypicture(id,cloths.getItemNumber(),StringImage,cloths.toString());
               return mypicHelpRead;
           }
           return null;
       }return null;
    }

    @PostMapping("/update")
    @Override
    public Cloths update(@RequestBody Cloths cloths) {
        return clothsService.Update(cloths);
    }

    @GetMapping("/delete")
    @Override
    public Cloths delete(@RequestParam("id") String id) {
        return clothsService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Cloths> readAll() {
        return clothsService.readAll();
    }
}