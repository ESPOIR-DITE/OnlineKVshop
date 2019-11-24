package com.etoiledespoir.onlinekvshop.controller.joins;

import com.etoiledespoir.onlinekvshop.domain.ViewProduct;
import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.braind.Braind;
import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.domain.gender.Gender;
import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.domain.joins.ItemView;
import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.factory.domain.genericFactory.item_picture.ItemPictureFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.join.ItemViewFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.join.ViewProductFactory;
import com.etoiledespoir.onlinekvshop.service.braind.BraindService;
import com.etoiledespoir.onlinekvshop.service.braind.ItemBraindService;
import com.etoiledespoir.onlinekvshop.service.color.ColorService;
import com.etoiledespoir.onlinekvshop.service.color.ItemColorService;
import com.etoiledespoir.onlinekvshop.service.gender.GenderService;
import com.etoiledespoir.onlinekvshop.service.gender.ItemGenderService;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.pictures.ImagesService;
import com.etoiledespoir.onlinekvshop.service.pictures.Item_PicturesService;
import com.etoiledespoir.onlinekvshop.service.product.ProductService;
import com.etoiledespoir.onlinekvshop.service.size.ItemSizeService;
import com.etoiledespoir.onlinekvshop.service.size.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/OKVS/join")
public class JoinClass {
    @Autowired
    ProductService productService;
    @Autowired
    AccountingServce accountingServce;
    @Autowired
    Item_PicturesService item_picturesService;
    @Autowired
    ImagesService imagesService;
    @Autowired
    ItemGenderService itemGenderService;
    @Autowired
    GenderService genderService;
    @Autowired
    ItemSizeService itemSizeService;
    @Autowired
    SizeService sizeService;
    @Autowired
    ItemBraindService itemBraindService;
    @Autowired
    BraindService braindService;
    @Autowired
    ColorService colorService;
    @Autowired
    ItemColorService itemColorService;


    @GetMapping("/view")
    public List<ItemView> getAllItem() {
        List<ItemView> viewList = new ArrayList<>();
        for (int i = 0; i < productService.readAll().size(); i++) {
            Products product = productService.read(productService.readAll().get(i).getId());
            System.out.println("product Object: " + product.toString());
            Accounting accounting = accountingServce.read(product.getId());
            System.out.println("Account Object: " + accounting.toString());
            System.out.println("product id: " + product.getId());
            Item_Pictures imageId = item_picturesService.getItemPicture(product.getId());
            //System.out.println("image id: "+imageId.toString());
            Images images = imagesService.read(imageId.getImageId());
            //System.out.println("image id: "+images.toString());
            ItemView itemView = ItemViewFactory.getItemView(accounting.getItemId(), product.getName(), product.getDescription(), images.getImage(), accounting.getPrice());
            viewList.add(itemView);
        }
        return viewList;
    }

    /*** this method first read the product
     *  reads all the colors of that product
     * @param id
     * @return
     */
    @GetMapping("/read")
    public ViewProduct viewItem(@RequestParam("id") String id) {
        ViewProduct viewProduct = null;
        Products product = productService.read(id);

        ArrayList<Color> colors = new ArrayList<>();
        ArrayList<byte[]> images = new ArrayList<>();
        if (product != null) {
            //reading the colors
            for (int i = 0; i < itemColorService.getColorIdList(id).size(); i++) {
                colors.add(colorService.read(itemColorService.getColorIdList(id).get(i).getColorId()));
            }

            //reading the gender
            ItemGender itemGender = itemGenderService.read(id);
            Gender gender = genderService.read(itemGender.getGenderId());

            //reading the brand
            ItemBraind itemBraind = itemBraindService.read(id);
            Braind braind = braindService.read(itemBraind.getBraindId());

            // reading the Account
            Accounting accounting = accountingServce.read(id);

            //reading picture
            Item_Pictures item_pictures= item_picturesService.getItemPicture(id);
            for(int i=0;i<item_picturesService.readAllFileOf(id).size();i++){
                images.add(imagesService.read(item_picturesService.readAllFileOf(id).get(i).getImageId()).getImage() );
            }

            viewProduct = ViewProductFactory.getViewProduct(product.getId(), product.getName(), braind.getBraindName(), accounting.getPrice(), product.getDescription(), accounting.getQuantity(), colors,images);

            return viewProduct;
        }
        return null;
    }

}
