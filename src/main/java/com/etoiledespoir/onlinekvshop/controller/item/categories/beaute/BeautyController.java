package com.etoiledespoir.onlinekvshop.controller.item.categories.beaute;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import com.etoiledespoir.onlinekvshop.domain.item.Items;
import com.etoiledespoir.onlinekvshop.domain.item.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.domain.item.color.Color;
import com.etoiledespoir.onlinekvshop.domain.item.gender.ItemGender;
import com.etoiledespoir.onlinekvshop.domain.generic.item_picture.itemImage;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ItemType;
import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.MyItemHelper;
import com.etoiledespoir.onlinekvshop.domain.item.itemType.TypeOfItem;
import com.etoiledespoir.onlinekvshop.domain.item.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.domain.item.pictures.Images;
import com.etoiledespoir.onlinekvshop.domain.item.size.ItemSize;
import com.etoiledespoir.onlinekvshop.domain.item.size.Size;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountChangeFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.accounting.AccountingFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.ItemFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.braind.ItemBraindFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.ItemGenderFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.genericFactory.item_picture.ItemPictureFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.BeautyFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.pic.pictureHelpReader.MypicHelpReadFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.pictures.ImagesFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.product.ProductTypeFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.item.size.ItemSizeFactory;
import com.etoiledespoir.onlinekvshop.service.item.braind.BraindService;
import com.etoiledespoir.onlinekvshop.service.item.braind.ItemBraindService;
import com.etoiledespoir.onlinekvshop.service.item.color.ColorService;
import com.etoiledespoir.onlinekvshop.service.item.color.ItemColorService;
import com.etoiledespoir.onlinekvshop.service.item.items.impl.ItemService;
import com.etoiledespoir.onlinekvshop.service.user.gender.GenderService;
import com.etoiledespoir.onlinekvshop.service.user.gender.ItemGenderService;
import com.etoiledespoir.onlinekvshop.service.accounting.AccountChangeService;
import com.etoiledespoir.onlinekvshop.service.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.item.category.impl.BeautyService;
import com.etoiledespoir.onlinekvshop.service.item.mypic.impl.PictureService;
import com.etoiledespoir.onlinekvshop.service.item.pictures.ImagesService;
import com.etoiledespoir.onlinekvshop.service.item.pictures.ItemImageService;
import com.etoiledespoir.onlinekvshop.service.item.product.ProductService;
import com.etoiledespoir.onlinekvshop.service.item.product.ItemTypeService;
import com.etoiledespoir.onlinekvshop.service.item.productType.TypesService;
import com.etoiledespoir.onlinekvshop.service.item.size.ItemSizeService;
import com.etoiledespoir.onlinekvshop.service.item.size.SizeService;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import com.etoiledespoir.onlinekvshop.util.ImageResizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    ItemImageService itemImageService;
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
    private ItemService itemService;
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
    private TypesService typesService;
    @Autowired
    ProductService productService;
    @Autowired
    ItemTypeService itemTypeService;



    private ItemGender gender;
    private String itemGenderID;
    private String braindId;
    private ArrayList<Color> colorList = new ArrayList<>();
    private Images images;


    @PostMapping("/creatwithfile")
    public Boolean create(@RequestBody MyItemHelper beaut) throws IOException {

        Items items = ItemFactory.getItems(beaut.getItemName(),beaut.getDecription());
        if (items != null) {

            /** reading and create product type*/
            TypeOfItem typeOfItem =typesService.read(beaut.getItemType());
            if(typeOfItem !=null){
                ItemType itemType1 =ProductTypeFactory.getProductType(items.getId(), typeOfItem.getId());
                itemTypeService.creat(itemType1);

            /** reading the genderId*/
            for(int i=0;i<beaut.getGender().size();i++){
            itemGenderID = genderService.readWithGender(beaut.getGender().get(i)).getGenderId();

            gender = ItemGenderFactory.getItemGender(items.getId(), itemGenderID);
            itemGenderService.creat(gender);
            }
            /***creating item color*/
            colorList.addAll(colorService.itemColors(beaut.getColors())); // getting all the objects of the colors
            for (int i = 0; i < colorList.size(); i++) {
                itemColorService.creatList(colorList.get(i).getColorId(), items.getId());
            }
            /***reading the size and creating it*/
            for (int i=0;i<beaut.getSize().size();i++){
                Size sizeObj=sizeService.read(beaut.getSize().get(i));
                ItemSize size= ItemSizeFactory.getProductSize(sizeObj.getId(),items.getId());
                itemSizeService.creat(size);
            }

            /**creating Braind**/
            braindId = braindService.read(beaut.getBraind()).getBraindId();
            ItemBraind itemBraind = ItemBraindFactory.getItemBraind(braindId, items.getId());
            itemBraindService.creat(itemBraind);

            /**Accounting and History**/
            Accounting accounting = AccountingFactory.getAccounting(items.getId(), beaut.getPrice(), beaut.getQuantity());
            Accounthistory(accounting);

            /**image**/
            for (int i = 0; i < beaut.getImage().size(); i++) {
                //We need to first save the picture to a directory temporarelly.
                imagesService.pictureWriter(beaut.getImage().get(i));

                //here we are going to read the file from the file it was wrote so that we can resize them.
                ImageResizer.getResizedImage();

                //now we convert the file into byte again after resizing
                byte[] resized = imagesService.convertToBytes();

                images = ImagesFactory.getImages(decoreder(resized));
                if (images != null) {
                    imagesService.creat(images);
                    itemImage itemImage = ItemPictureFactory.getItem_picture(items.getId(), images.getId());
                        itemImageService.creat(itemImage);
                }
            }
                itemService.creat(items);
            }
            return true;
            //System.out.println(images.toString());

        }
        return false;
    }

    @GetMapping("/read")
    public MypicHelpRead readFile(@RequestParam("id") String id) {
        // BeautyMakeup beaute= beautyService.read(id);
        Items items = itemService.read(id);
        ArrayList<String> stringImage = new ArrayList<>();

        stringImage.addAll(getStringPictures(id));

        MypicHelpRead mypicHelpRead = MypicHelpReadFactory.getMypicture(items.getName(), getBraind(id), getGender(id), getPrice(id), stringImage, items.getDescription(), getSizesList(id), getColorList(id),getItemType(id));
        System.out.println(mypicHelpRead.toString() + "  reading mypictureHelp in Beauty Controller");

        return mypicHelpRead;
    }
    public String getItemType(String itemID){
        ItemType itemType = itemTypeService.read(itemID);
        return  typesService.read(itemType.getTypeId()).getTypeName();
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

        for (int i = 0; i < itemImageService.readAllFileOf(itemId).size(); i++) {
            //result.add(item_picturesService.readAllFileOf(id).get(i));
            stringImage.add(Base64.getEncoder().encodeToString((imagesService.read(itemImageService.readAllFileOf(itemId).get(i).getImageId()).getImage())));
        }
        return stringImage;
    }


//    @PostMapping("/update")
//    public BeautyMakeup update(@RequestBody BeautyMakeup beautyMakeup) {
//        return beautyService.Update(beautyMakeup);
//    }

//    @GetMapping("/Delete")
//    public BeautyMakeup delete(@RequestParam("id") String id) {
//        boolean result = pictureService.deleteFromFile(id);
//        if (result) {
//            return beautyService.delete(id);
//        }
//        return null;
//    }

//    @GetMapping("/reads")
//    public List<BeautyMakeup> readAll() {
//        return beautyService.readAll();
//    }


//    public Boolean helpCreateFile(MultipartFile file, String id) throws IOException {
//        File filenew = new File(work + id + ".png");
//        filenew.createNewFile();
//
//        FileOutputStream fos = new FileOutputStream(filenew);
//        fos.write(file.getBytes());
//        fos.close();
//        if (file != null) {
//            pictureService.creatImage(filenew, id);
//            filenew.delete();
//            return true;
//        }
//        return false;
//    }

    public byte[] decoreder(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }
    public void Accounthistory(Accounting accounting) {
         try {
        int intialQuantity = accountingServce.read(accounting.getItemId()).getQuantity();
        if(intialQuantity!=0){
            AccountChange accountChange = AccountChangeFactory.getAccount(accounting.getItemId(), CurrentDate.getCurrentTimeUsingDate(), intialQuantity, accounting.getQuantity(), accounting.toString());
            accountChangeService.creat(accountChange);
        }
             accountingServce.creat(accounting);
         }catch (NullPointerException ex) {
             accountingServce.creat(accounting);
             System.out.println("null point catch");
         }

    }
}