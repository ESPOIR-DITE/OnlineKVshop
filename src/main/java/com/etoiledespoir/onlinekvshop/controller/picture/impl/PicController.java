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
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/OKVS/picture")
public class PicController implements Icontroller<Mypic,String> {
    @Autowired
    PictureService pictureService;
    BufferedImage bufferedImage;


    FileInputStream fileInputStream = null;
    @PostMapping(value = "/create")
    public Mypic create(@RequestBody MypicHelper mypicHelper) {
        System.out.println(mypicHelper.toString());
        //byte[] fileContent=null;
        Mypic mypic=MypicFactory.getMypic(mypicHelper.getItemId(),mypicHelper.getDescription());
       /**String stringBase64= pictureService.creatImage(mypicHelper.getImage(),mypicHelper.getItemId());
        System.out.println(stringBase64+" reading Base64 in controller");
        if(!stringBase64.equals(null)) {
            return pictureService.creat(mypic);
            //System.out.println();
        }*/
        return  pictureService.creat(mypic);
    }

    @Override
    public Mypic create(Mypic mypic) {
        return null;
    }

    /**
     * this method creats a item picture
     * @param file
     * @param id
     * @param description
     * @return
     * @throws IOException
     */
    @PostMapping("/upload")
    public Mypic create(@RequestParam("file")MultipartFile  file,@RequestParam("id")String id,@RequestParam("desc")String description) throws IOException {

        System.out.println(file.getName());
        System.out.println(id+" my id");
        Mypic mypic = MypicFactory.getMypic(id,description);


        File filenew = new File("C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+file.getName()+".png");

        filenew.createNewFile();

        FileOutputStream fos = new FileOutputStream(filenew);
        fos.write(file.getBytes());
        fos.close();


        String itemId=pictureService.creat(mypic).getItemId();
        pictureService.creatImage(filenew,itemId);
        filenew.delete();
        return mypic;
    }

    @GetMapping("/read")
    public MypicHelpRead readImage(@RequestParam("id") String id) {
        Mypic mypic=pictureService.read(id);
        String imageString=pictureService.readFile(id);
        MypicHelpRead mypicHelpRead= MypicHelpReadFactory.getMypicture(mypic.getItemId(),mypic.getItemId(),imageString,mypic.getDescription());
        return mypicHelpRead;
    }
    @Override
    public Mypic read(String id){
        return null;
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
    @GetMapping("/readsfile")
    public List<String> readAllFile() throws IOException {
        return pictureService.readAllImage();
    }

    public String decoder(byte[] image){
        String fileContent=null;

            String encodedString = Base64.getEncoder().encodeToString(image);

        return fileContent;
    }
}
