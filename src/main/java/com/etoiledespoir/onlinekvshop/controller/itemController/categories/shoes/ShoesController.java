package com.etoiledespoir.onlinekvshop.controller.itemController.categories.shoes;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.impl.shoes.Shoes;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.factory.domain.item.ShoesFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.service.itemService.category.shoes.impl.ShoesService;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/OKVS/shoes")
public class ShoesController{}/** implements Icontroller<Shoes, String> {

    @Autowired
    ShoesService shoesService;
    @Autowired
    PictureService pictureService;
    private boolean result=false;

    @PostMapping("/create")
    public Shoes createWithFile(@RequestParam("file") MultipartFile file,@RequestParam("itemName") String marque,@RequestParam("type") String itemType,@RequestParam("size") String size, String gender,@RequestParam("desc") String desc,@RequestParam("clore") String color) throws IOException {
        Shoes shoes= ShoesFactory.getShoes(marque,size,gender,desc);
        Shoes result1=shoesService.creat(shoes);
        if(result1!=null){
            result= pictureService.helpCreateFile(file,result1.getItemNumber());
            if(result==true){
                return result1;
            }
        }
        return null;
    }

    @Override
    public Shoes create(Shoes shoes) {
        return null;
    }

    @Override
    public Shoes read(String id) {
        return null;
    }

    @GetMapping("/read")
    public MypicHelpRead readWithImage(@RequestParam("id") String id) {
        Shoes shoes=shoesService.read(id);
        if(shoes!=null){
            String StringImage=pictureService.readFile(id);
            if(StringImage!=null||StringImage.equals("")){
                MypicHelpRead mypicHelpRead= MypicHelpReadFactory.getMypicture(id,shoes.getItemNumber(),shoes.getColor(),shoes.toString());
                return mypicHelpRead;
            }
        }
        return null;
    }

    @PostMapping("/update")
    @Override
    public Shoes update(@RequestBody Shoes shoes) {
        return shoesService.Update(shoes);
    }

    @GetMapping("/delete")
    @Override
    public Shoes delete(@RequestParam("id") String id) {
        Shoes shoes=null;
        MypicHelpRead result=readWithImage(id);
        if(result!=null){
            shoes=shoesService.delete(id);
            if(pictureService.deleteFromFile(id)==true){
                return shoes;
            }

        }
        return null;
    }

    @GetMapping("/reads")
    @Override
    public List<Shoes> readAll() {
        return shoesService.readAll();
    }
}*/