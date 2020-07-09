package com.etoiledespoir.onlinekvshop.domain.checkout;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.order.card.Card;
import com.etoiledespoir.onlinekvshop.domain.generic.item_picture.itemImage;
import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import com.etoiledespoir.onlinekvshop.domain.item.pictures.Images;
import com.etoiledespoir.onlinekvshop.service.item.card.CardService;
import com.etoiledespoir.onlinekvshop.service.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.item.pictures.ImagesService;
import com.etoiledespoir.onlinekvshop.service.item.pictures.ItemImageService;
import com.etoiledespoir.onlinekvshop.service.item.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/OKVS/checkout")
public class CheckOutController {
    @Autowired
    CardService cardService;
    @Autowired
    ItemImageService item_picturesService;
    @Autowired
    ImagesService imagesService;
    @Autowired
    ProductService productService;
    @Autowired
    AccountingServce accountingServce;
    @PostMapping("/read")
    public CheckOut read(@RequestBody Card card){
        itemImage item_pictures= item_picturesService.getItemPicture(card.getItemId());
        Products products=productService.read(card.getItemId());
        Images images=imagesService.read(item_pictures.getImageId());
        Accounting accounting=accountingServce.readwithItemId(card.getItemId());
        double total=calculte(card.getQuantity(),accounting.getPrice());
        CheckOut checkOut=new CheckOut(images.getImage(),products.getDescription(),accounting.getPrice(),card.getQuantity(),total,card.getItemId());
       // System.out.println(checkOut.toString());
        return checkOut;
    }
    public double calculte(int quantity, double price){
        return quantity*price;
    }
}
