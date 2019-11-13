package com.etoiledespoir.onlinekvshop.controller.itemController.categories.beaute;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ProductType;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.MyItemHelper;
import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.domain.itemType.Types;
import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.domain.size.ProductSize;
import com.etoiledespoir.onlinekvshop.domain.size.Size;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountChangeFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountingFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.braind.ItemBraindFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.gender.ItemGenderFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.genericFactory.item_picture.ItemPictureFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.BeautyFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.pictures.ImagesFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.product.ProductFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.product.ProductTypeFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.size.ItemSizeFactory;
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
import com.etoiledespoir.onlinekvshop.service.product.ProductService;
import com.etoiledespoir.onlinekvshop.service.product.ProductTypeservice;
import com.etoiledespoir.onlinekvshop.service.productType.TypesService;
import com.etoiledespoir.onlinekvshop.service.size.ItemSizeService;
import com.etoiledespoir.onlinekvshop.service.size.SizeService;
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
@RequestMapping("/OKVS/myitems")
public class BeautyController {

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
    @Autowired
    private SizeService sizeService;
    @Autowired
    private ItemSizeService itemSizeService;



    @Autowired
    ProductService productService;
    @Autowired
    ProductTypeservice productTypeservice;
    @Autowired
    TypesService typesService;

    private String home = "C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisior\\";
   // private String work = "C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\";

    private BeautyFactory BF;
    private ItemPictureFactory IPF;
    private ImagesFactory IF;

    private ItemGender gender;
    private String itemGenderID;
    private String braindId;
    private ArrayList<Color> colorList = new ArrayList<>();
    private Images images;


    @PostMapping("/creatwithfile")
    public Boolean create(@RequestBody MyItemHelper beaut) {
        System.out.println(beaut.toString());
        //BeautyMakeup BM=BeautyFactory.getBeauty(beaut.getSizeNumber(),beaut.getTypeName());
        Products BM = ProductFactory.getProduct(beaut.getItemName(), beaut.getDecription());

        if (BM != null) {
            /** reading and create product type*/
            Types productType=typesService.read(beaut.getItemType());
            if(productType!=null){
                ProductType productType1=ProductTypeFactory.getProductType(BM.getId(),productType.getId());
                productTypeservice.creat(productType1);

            /** reading the genderId*/
            for(int i=0;i<beaut.getGender().size();i++){
            itemGenderID = genderService.readWithGender(beaut.getGender().get(i));
            /** creating itemGender*/
            gender = ItemGenderFactory.getItemGender(BM.getId(), itemGenderID);
            itemGenderService.creat(gender);
            }
            /***creating item color*/
            colorList.addAll(colorService.itemColors(beaut.getColors())); // getting all the objects of the colors
            for (int i = 0; i < colorList.size(); i++) {
                itemColorService.creatList(colorList.get(i).getColorId(), BM.getId());
            }
            /***reading the size and creating it*/
            for (int i=0;i<beaut.getSize().size();i++){
                Size sizeObj=sizeService.read(beaut.getSize().get(i));
                ProductSize size= ItemSizeFactory.getProductSize(sizeObj.getId(),BM.getId());
                itemSizeService.creat(size);
            }

            /**creating Braind**/
            braindId = braindService.readWithName(beaut.getBraind()).getBraindId();
            ItemBraind itemBraind = ItemBraindFactory.getItemBraind(braindId, BM.getId());
            itemBraindService.creat(itemBraind);
            /**Accounting and History**/
            Accounting accounting = AccountingFactory.getAccounting(BM.getId(), beaut.getPrice(), beaut.getQuantity());
            Accounthistory(accounting);
            /**image**/
            for (int i = 0; i < beaut.getImage().size(); i++) {
                images = ImagesFactory.getImages(decoreder(beaut.getImage().get(i)));
                if (images != null) {
                    imagesService.creat(images);
                    Item_Pictures IP = ItemPictureFactory.getItem_picture(BM.getId(), images.getId());
                    if (IP != null) {
                        item_picturesService.creat(IP);
                        productService.creat(BM);
                    }
                }
            }}
            return true;
            //System.out.println(images.toString());

        }
        return false;
    }

    @GetMapping("/read")
    public MypicHelpRead readFile(@RequestParam("id") String id) {
        // BeautyMakeup beaute= beautyService.read(id);
        Products beaute = productService.read(id);
        ArrayList<String> stringImage = new ArrayList<>();
        ArrayList<Item_Pictures> picturesresult = new ArrayList<>();
        ArrayList<ItemColor> colorsresult = new ArrayList<>();

        stringImage.addAll(getStringPictures(id));

        MypicHelpRead mypicHelpRead = MypicHelpReadFactory.getMypicture(beaute.getName(), getBraind(id), getGender(id), getPrice(id), stringImage, beaute.getDescription(), getSizesList(id), getColorList(id),getItemType(id));
        System.out.println(mypicHelpRead.toString() + "  reading mypictureHelp in Beauty Controller");

        return mypicHelpRead;
    }
    public String getItemType(String itemID){
        String productTypeStr=null;
        ProductType productType =productTypeservice.read(itemID);
        return  productTypeStr=typesService.read(productType.getTypeName()).getTypeName();
    }

    public ArrayList<Size> getSizesList(String id) {
        ArrayList<Size> sizes = new ArrayList<>();
        //String sizeId=itemSizeService.read(id).getSizeId();
        for (int i = 0; i < itemSizeService.productSizeList(id).size(); i++) {
            sizes.add(sizeService.read(itemSizeService.productSizeList(id).get(i).getItemId()));
        }
        return sizes;
    }

    public ArrayList<Color> getColorList(String id) {
        ArrayList<Color> colors = new ArrayList<>();
        //String colorId=itemColorService.getColorIdList(id);
        for (int i = 0; i < itemColorService.getColorIdList(id).size(); i++) {
            colors.add(colorService.read(itemColorService.getColorIdList(id).get(i).getColorId()));
        }
        return colors;
    }

    public String getBraind(String itemId) {
        braindId = itemBraindService.read(itemId).getBraindId();
        String myBraind = braindService.read(braindId).getBraindName();
        return myBraind;
    }

    public String getGender(String itemid) {
        String genderId = itemGenderService.read(itemid).getGenderId();
        String mygender = genderService.read(genderId).getGenderName();
        return mygender;
    }

    public double getPrice(String itemId) {
        double price = accountingServce.read(itemId).getPrice();
        return price;
    }

    /**
     * this method first read all the itemPicture with the item id
     * secondly it reads all the pictures of of each picture id
     * this method returns an array of Base64 decoded string
     * it is an array of pictures in string format
     *
     * @param itemId
     * @return
     */
    public List<String> getStringPictures(String itemId) {
        ArrayList<String> stringImage = new ArrayList<>();

        for (int i = 0; i < item_picturesService.readAllFileOf(itemId).size(); i++) {
            //result.add(item_picturesService.readAllFileOf(id).get(i));
            stringImage.add(Base64.getEncoder().encodeToString((imagesService.read(item_picturesService.readAllFileOf(itemId).get(i).getImageId()).getImage())));
        }
        return stringImage;
    }


    @PostMapping("/update")
    public BeautyMakeup update(@RequestBody BeautyMakeup beautyMakeup) {
        return beautyService.Update(beautyMakeup);
    }

    @GetMapping("/Delete")
    public BeautyMakeup delete(@RequestParam("id") String id) {
        boolean result = pictureService.deleteFromFile(id);
        if (result == true) {
            return beautyService.delete(id);
        }
        return null;
    }

    @GetMapping("/reads")
    public List<BeautyMakeup> readAll() {
        return beautyService.readAll();
    }


    public Boolean helpCreateFile(MultipartFile file, String id) throws IOException {
        File filenew = new File(home + id + ".png");
        filenew.createNewFile();

        FileOutputStream fos = new FileOutputStream(filenew);
        fos.write(file.getBytes());
        fos.close();
        if (file != null) {
            pictureService.creatImage(filenew, id);
            filenew.delete();
            return true;
        }

        return false;

    }

    public byte[] decoreder(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }

    public void Accounthistory(Accounting accounting) {
        int intialQuantity = accountingServce.read(accounting.getItemId()).getQuantity();
        accountingServce.creat(accounting);
        AccountChange accountChange = AccountChangeFactory.getAccount(accounting.getItemId(), CurrentDate.getCurrentTimeUsingDate(), intialQuantity, accounting.getQuantity(), accounting.toString());
        accountChangeService.creat(accountChange);
    }
}