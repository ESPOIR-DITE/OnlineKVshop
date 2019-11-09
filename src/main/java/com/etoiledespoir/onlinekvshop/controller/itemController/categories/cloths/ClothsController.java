package com.etoiledespoir.onlinekvshop.controller.itemController.categories.cloths;

import org.springframework.web.bind.annotation.*;

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
    public Boolean createAll(@RequestBody MyItemHelper b) throws IOException {
       //Cloths cloths= ClothsFactory.getCloths(name,type,size,marque,gender,desc,color);
       Products products= ProductFactory.getProduct(b.getItemName(),b.getDecription());
       if (products != null) {
           //**create the product*/
          // String productid=productService.creat(products).getId();
           /** reading the genderId*/
        //  String  itemGenderID = genderService.readWithGender(b.getGenderName());
           /** creating itemGender*/
        //   gender = ItemGenderFactory.getItemGender(products.getId(), itemGenderID);
        //   /***creating item color*/
         //  colorList.addAll(colorService.itemColors(b.getColors())); // getting all the objects of the colors
        //   for (int i = 0; i < colorList.size(); i++) {
        //       itemColorService.creatList(colorList.get(i).getColorId(), products.getId());
        //   }
           /**creating Braind**/
        //   String braindId = braindService.readWithName(b.getBraindName()).getBraindId();
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