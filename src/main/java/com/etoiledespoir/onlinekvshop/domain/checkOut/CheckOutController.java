package com.etoiledespoir.onlinekvshop.domain.checkOut;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.card.Card;
import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.service.card.CardService;
import com.etoiledespoir.onlinekvshop.service.itemService.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.pictures.ImagesService;
import com.etoiledespoir.onlinekvshop.service.pictures.Item_PicturesService;
import com.etoiledespoir.onlinekvshop.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/OKVS/checkout")
public class CheckOutController {
    @Autowired
    CardService cardService;
    @Autowired
    Item_PicturesService item_picturesService;
    @Autowired
    ImagesService imagesService;
    @Autowired
    ProductService productService;
    @Autowired
    AccountingServce accountingServce;
    @PostMapping("/read")
    public CheckOut read(@RequestBody Card card){
        Item_Pictures item_pictures= item_picturesService.getItemPicture(card.getItemId());
        Products products=productService.read(card.getItemId());
        Images images=imagesService.read(item_pictures.getImageId());
        Accounting accounting=accountingServce.readwithItemId(card.getItemId());
        double total=calculte(card.getQuantity(),accounting.getPrice());
        CheckOut checkOut=new CheckOut(images.getImage(),products.getDescription(),accounting.getPrice(),card.getQuantity(),total);
       // System.out.println(checkOut.toString());
        return checkOut;
    }
    public double calculte(int quantity, double price){
        return quantity*price;
    }
}
