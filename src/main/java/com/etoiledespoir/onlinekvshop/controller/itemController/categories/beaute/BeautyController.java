package com.etoiledespoir.onlinekvshop.controller.itemController.categories.beaute;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.domain.gender.Gender;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.BeautyHelper;
import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountChangeFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountingFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.braind.ItemBraindFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.gender.GenderFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.gender.ItemGenderFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.genericFactory.item_picture.ItemPictureFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.BeautyFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pictures.ImagesFactory;
import com.etoiledespoir.onlinekvshop.service.braind.BraindService;
import com.etoiledespoir.onlinekvshop.service.braind.ItemBraindService;
import com.etoiledespoir.onlinekvshop.service.color.ColorService;
import com.etoiledespoir.onlinekvshop.service.color.ItemColorService;
import com.etoiledespoir.onlinekvshop.service.gender.GenderService;
import com.etoiledespoir.onlinekvshop.service.gender.ItemGenderService;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountChangeService;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.itemService.category.beaute.impl.BeautyService;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import com.etoiledespoir.onlinekvshop.service.pictures.ImagesService;
import com.etoiledespoir.onlinekvshop.service.pictures.Item_PicturesService;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/OKVS/beaty")
public class BeautyController implements Icontroller<BeautyMakeup, String> {

    @Autowired
    BeautyService beautyService;
    @Autowired
    PictureService pictureService;
    @Autowired
    Item_PicturesService item_picturesService;
    @Autowired
    ImagesService imagesService;
    @Autowired
    GenderService genderService;
    @Autowired
    ItemGenderService itemGenderService;
    @Autowired
    ItemColorService itemColorService;
    @Autowired
    ItemBraindService itemBraindService;
    @Autowired
    ColorService colorService;
    @Autowired
    BraindService braindService;
    @Autowired
    AccountingServce accountingServce;
    @Autowired
    AccountChangeService accountChangeService;


    private String home="C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisior\\";
    private String work="C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\";

    private BeautyFactory BF;
    private ItemPictureFactory IPF;
    private ImagesFactory IF;

    private ItemGender gender;
    private String itemGenderID;
    private String braindId;
    private ArrayList<Color>colorList=new ArrayList<>();
    private Images images;

    @Override
    public BeautyMakeup create(BeautyMakeup beautyMakeup) {
        return null;
    }

    @PostMapping("/creatwithfile")
    public Boolean create(@RequestBody BeautyHelper beaut) {
        System.out.println(beaut.toString());
        BeautyMakeup BM=BeautyFactory.getBeauty(beaut.getSize(),beaut.getType());

        if(BM!=null){
            /** reading the genderId*/
            itemGenderID= genderService.readWithGender(beaut.getGender());
            /** creating itemGender*/
            gender= ItemGenderFactory.getItemGender(BM.getItemNumber(),itemGenderID);
            itemGenderService.creat(gender);
            /***creating item color*/
            colorList.addAll(colorService.itemColors(beaut.getColors())); // getting all the objects of the colors
            for(int i=0;i<colorList.size();i++) {
                itemColorService.creatList(colorList.get(i).getColorId(), BM.getItemNumber());
            }
            /**creating Braind**/
            braindId=braindService.readWithName(beaut.getBraind()).getBraindId();
            ItemBraind itemBraind= ItemBraindFactory.getItemBraind(braindId,BM.getItemNumber());
            itemBraindService.creat(itemBraind);
            /**Accounting and History**/
            Accounting accounting= AccountingFactory.getAccounting(BM.getItemNumber(),beaut.getPrice(),beaut.getQuantity());
            Accounthistory(accounting);
            /**image**/
            for(int i=0;i<beaut.getImage().size();i++) {
               images = ImagesFactory.getImages(decoreder(beaut.getImage().get(i)));
                if(images!=null){
                    imagesService.creat(images);
                    Item_Pictures IP=ItemPictureFactory.getItem_picture(BM.getItemNumber(),images.getId());
                    if(IP!=null) {
                        item_picturesService.creat(IP);

                    }
                }
            }
            return true;
            //System.out.println(images.toString());

        }
        return false;
    }

    @GetMapping("/read")
    public MypicHelpRead readFile(@RequestParam("id") String id) {
        BeautyMakeup mypic= beautyService.read(id);
        ArrayList<String>stringImage=new ArrayList<>();
        ArrayList<Item_Pictures>result=new ArrayList<>();
        for(int i=0;i<item_picturesService.readAllFileOf(id).size();i++){
            //result.add(item_picturesService.readAllFileOf(id).get(i));
            stringImage.add(Base64.getEncoder().encodeToString((imagesService.read(item_picturesService.readAllFileOf(id).get(i).getImageId()).getImage())));
        }


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
        File filenew = new File(work+id+".png");
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
    public byte[] decoreder(byte[] image){
      String  encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }
    public void Accounthistory(Accounting accounting){
        int intialQuantity=accountingServce.read(accounting.getItemId()).getQuantity();
        accountingServce.creat(accounting);
        AccountChange accountChange= AccountChangeFactory.getAccount(accounting.getItemId(), CurrentDate.getCurrentTimeUsingDate(),intialQuantity,accounting.getQuantity(),accounting.toString());
        accountChangeService.creat(accountChange);
    }
}