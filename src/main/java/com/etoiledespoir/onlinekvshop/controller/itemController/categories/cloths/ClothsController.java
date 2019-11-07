package com.etoiledespoir.onlinekvshop.controller.itemController.categories.cloths;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.domain.gender.Gender;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.BeautyHelper;
import com.etoiledespoir.onlinekvshop.domain.item.impl.cloths.Cloths;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountChangeFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountingFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.braind.ItemBraindFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.gender.ItemGenderFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.genericFactory.item_picture.ItemPictureFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.ClothsFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pictures.ImagesFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.product.ProductFactory;
import com.etoiledespoir.onlinekvshop.service.braind.BraindService;
import com.etoiledespoir.onlinekvshop.service.braind.ItemBraindService;
import com.etoiledespoir.onlinekvshop.service.color.ColorService;
import com.etoiledespoir.onlinekvshop.service.color.ItemColorService;
import com.etoiledespoir.onlinekvshop.service.gender.GenderService;
import com.etoiledespoir.onlinekvshop.service.gender.ItemGenderService;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountChangeService;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.itemService.category.cloths.impl.ClothsService;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import com.etoiledespoir.onlinekvshop.service.pictures.ImagesService;
import com.etoiledespoir.onlinekvshop.service.pictures.Item_PicturesService;
import com.etoiledespoir.onlinekvshop.service.product.ProductService;
import com.etoiledespoir.onlinekvshop.service.size.ItemSizeService;
import com.etoiledespoir.onlinekvshop.service.size.SizeService;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/OKVS/cloths")
public class ClothsController{}/** implements Icontroller<Cloths, String> {
   @Autowired
    ClothsService clothsService;
   @Autowired
    PictureService pictureService;
   @Autowired
    ProductService productService;
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
    @Autowired
    private SizeService sizeService;
    @Autowired
    private ItemSizeService itemSizeService;
    ItemGender gender;
    private Images images;
   private boolean result=false;
    private ArrayList<Color> colorList = new ArrayList<>();

   @PostMapping("/create")
    public Boolean createAll(@RequestBody BeautyHelper b) throws IOException {
       //Cloths cloths= ClothsFactory.getCloths(name,type,size,marque,gender,desc,color);
       Products products= ProductFactory.getProduct(b.getItemName(),b.getDecription());
       if (products != null) {
           //**create the product*/
          // String productid=productService.creat(products).getId();
           /** reading the genderId*/
        //  String  itemGenderID = genderService.readWithGender(b.getGender());
           /** creating itemGender*/
        //   gender = ItemGenderFactory.getItemGender(products.getId(), itemGenderID);
        //   /***creating item color*/
         //  colorList.addAll(colorService.itemColors(b.getColors())); // getting all the objects of the colors
        //   for (int i = 0; i < colorList.size(); i++) {
        //       itemColorService.creatList(colorList.get(i).getColorId(), products.getId());
        //   }
           /**creating Braind**/
        //   String braindId = braindService.readWithName(b.getBraind()).getBraindId();
        //   ItemBraind itemBraind = ItemBraindFactory.getItemBraind(braindId, products.getId());
        //   itemBraindService.creat(itemBraind);
           /**Accounting and History**/
         //  Accounting accounting = AccountingFactory.getAccounting(products.getId(), b.getPrice(), b.getQuantity());
         //  Accounthistory(accounting);
           /**image**/
       /**    for (int i = 0; i < b.getImage().size(); i++) {
               images = ImagesFactory.getImages(decoreder(b.getImage().get(i)));
               if (images != null) {
                   imagesService.creat(images);
                   Item_Pictures IP = ItemPictureFactory.getItem_picture(products.getId(), images.getId());
                   if (IP != null) {
                       item_picturesService.creat(IP);
                       productService.creat(products);
                   }
               }
           }
           return true;
           //System.out.println(images.toString());

       }
       return false;
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
    public void Accounthistory(Accounting accounting) {
        int intialQuantity = accountingServce.read(accounting.getItemId()).getQuantity();
        accountingServce.creat(accounting);
        AccountChange accountChange = AccountChangeFactory.getAccount(accounting.getItemId(), CurrentDate.getCurrentTimeUsingDate(), intialQuantity, accounting.getQuantity(), accounting.toString());
        accountChangeService.creat(accountChange);
    }
    public byte[] decoreder(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }
}*/