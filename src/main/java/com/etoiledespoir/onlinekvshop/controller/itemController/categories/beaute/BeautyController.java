package com.etoiledespoir.onlinekvshop.controller.itemController.categories.beaute;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.impl.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.factory.domain.item.BeautyFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.service.itemService.category.beaute.impl.BeautyService;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/OKVS/beaty")
public class BeautyController implements Icontroller<BeautyMakeup, String> {

    @Autowired
    BeautyService beautyService;
    @Autowired
    PictureService pictureService;

    private String home="C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisior\\";
    private String work="C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\";


    @PostMapping("/create")
    //public BeautyMakeup create(@RequestBody BeautyMakeup beautyMakeup) {
   public BeautyMakeup create(@RequestParam("file") MultipartFile file,@RequestParam("ItemName") String ItemName,@RequestParam("size") String size,@RequestParam("decription") String decription,@RequestParam("color") String color) throws IOException {
        System.out.println(file.getName());
        BeautyMakeup beautyMakeup= BeautyFactory.getBeauty(ItemName,size,decription,color);
        System.out.println(beautyMakeup+" factory Beauty");
        BeautyMakeup result = beautyService.creat(beautyMakeup);
        System.out.println(result+" result from service");
        if(result!=null) {
            System.out.println(result.toString()+" viewing the object");
            if (helpCreateFile(file, result.getItemNumber())==true) {
                return result;
            }
            beautyService.delete(result.getItemNumber());
            return null;
        }
        return null;
    }

    @Override
    public BeautyMakeup create(BeautyMakeup beautyMakeup) {
        return null;
    }

    @GetMapping("/read")

    public MypicHelpRead readFile(@RequestParam("id") String id) {
        BeautyMakeup mypic= beautyService.read(id);
        String imageString=pictureService.readFile(id);
        MypicHelpRead mypicHelpRead= MypicHelpReadFactory.getMypicture(mypic.getItemNumber(),mypic.getItemName(),imageString,mypic.getDecription());
        System.out.println(mypicHelpRead.toString()+"  reading mypictureHelp in Beauty Controller");

        return mypicHelpRead;
    }
    @Override
    public BeautyMakeup read(@RequestParam("id") String id) {
       return null;
    }

    @PostMapping("/update")
    @Override
    public BeautyMakeup update(@RequestBody BeautyMakeup beautyMakeup) {
        return beautyService.Update(beautyMakeup);
    }

    @GetMapping("/Delete")
    @Override
    public BeautyMakeup delete(@RequestParam("id") String id) {
       boolean result= pictureService.deleteFromFile(id);
       if(result==true) {
           return beautyService.delete(id);
       }
       return null;
    }

    @GetMapping("/reads")
    @Override
    public List<BeautyMakeup> readAll() {
        return beautyService.readAll();
    }
    public Boolean helpCreateFile(MultipartFile file,String id) throws IOException {
        File filenew = new File(home+id+".png");
        filenew.createNewFile();

        FileOutputStream fos = new FileOutputStream(filenew);
        fos.write(file.getBytes());
        fos.close();
    if(file!=null) {
        pictureService.creatImage(filenew, id);
        filenew.delete();
        return true;
    }

    return false;

    }
}