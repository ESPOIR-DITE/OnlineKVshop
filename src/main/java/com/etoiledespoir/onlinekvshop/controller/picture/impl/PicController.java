package com.etoiledespoir.onlinekvshop.controller.picture.impl;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelper;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.MypicFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/OKVS/picture")
public class PicController implements Icontroller<Mypic,String> {
    @Autowired
    PictureService pictureService;
    @PostMapping("/create")
    public Mypic create(@RequestBody MypicHelper mypicHelper) {
        System.out.println(mypicHelper.toString());
        //byte[] fileContent=null;
        Mypic mypic=MypicFactory.getMypic(mypicHelper.getItemId(),mypicHelper.getImage(),mypicHelper.getDescription());
        return pictureService.creat(mypic);
    }

    @Override
    public Mypic create(Mypic mypic) {
        return null;
    }

    @GetMapping("/read")
    @Override

    public Mypic read(@RequestParam("id") String id) {
        Mypic mypic=pictureService.read(id);
        //String imageString=decoder(mypic.);
       // MypicHelpRead mypicHelpRead= MypicHelpReadFactory.getMypicture(mypic.getItemId(),mypic.getItemId(),mypic.getImage(),)
        return mypic;
    }
    @PostMapping("/update")
    @Override
    public Mypic update(@RequestBody Mypic mypic) {
        return pictureService.Update(mypic);
    }
    @GetMapping("delete")
    @Override
    public Mypic delete(@RequestParam("id")String id) {
        return pictureService.delete(id);
    }
    @GetMapping("/reads")
    @Override
    public List<Mypic> readAll() {
        return pictureService.readAll();
    }

    public String decoder(byte[] image){
        String fileContent=null;

            String encodedString = Base64.getEncoder().encodeToString(image);

        return fileContent;
    }
}
