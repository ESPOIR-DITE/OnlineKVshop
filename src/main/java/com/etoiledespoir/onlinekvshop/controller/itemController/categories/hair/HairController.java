package com.etoiledespoir.onlinekvshop.controller.itemController.categories.hair;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.impl.hair.Hair;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.factory.domain.item.HairFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.service.itemService.category.hair.impl.HairService;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/OKVS/hair")
public class HairController implements Icontroller<Hair, String> {
@Autowired
    HairService hairService;
    @Autowired
    PictureService pictureService;
    private boolean resultBool=false;

@PostMapping("/create")

    public Hair createWithFile(@RequestParam("file") MultipartFile file,@RequestParam("name")String name,@RequestParam("type")String type,@RequestParam("size")String size,@RequestParam("desc")String desc,@RequestParam("color")String color) throws IOException {
    Hair hair= HairFactory.getHair(name,type,size,desc,color);
    if(hair!=null) {
        Hair result= hairService.creat(hair);
        if(result!=null){
            resultBool= pictureService.helpCreateFile(file,result.getItemNumber());
            if(resultBool==true){
                return result;
            }
        }
    }return null;
    }

    @Override
    public Hair create(Hair hair) {
        return null;
    }

    @Override
    public Hair read(String id) {
        return null;
    }

    @GetMapping("/read")

    public MypicHelpRead readWithImage(@RequestParam("id") String id) {
       Hair hair=  hairService.read(id);
       if(hair!=null){
           String StringImage = pictureService.readFile(id);
           if(StringImage!=null||StringImage.equals("")){
               MypicHelpRead mypicHelpRead= MypicHelpReadFactory.getMypicture(id,hair.getItemNumber(),StringImage,hair.toString());
                return mypicHelpRead;
           }
       }
       return null;
    }

    @PostMapping("/update")
    @Override
    public Hair update(@RequestBody Hair hair) {
        return hairService.Update(hair);
    }

    @GetMapping("/delete")
    @Override
    public Hair delete(@RequestParam("id") String id) {
        Hair hair=null;
    String readId=readWithImage(id).getId();
        if(readId!=null){
             hair= hairService.delete(id);

                if(pictureService.deleteFromFile(id)==true){
                    return hair;
                }

        }return null;
    }

    @GetMapping("/reads")
    @Override
    public List<Hair> readAll() {
        return hairService.readAll();
    }
}