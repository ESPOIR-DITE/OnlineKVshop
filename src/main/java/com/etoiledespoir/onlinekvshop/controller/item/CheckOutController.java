package com.etoiledespoir.onlinekvshop.controller.item;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.item.Items;
import com.etoiledespoir.onlinekvshop.domain.item.checkout.CheckOut;
import com.etoiledespoir.onlinekvshop.domain.order.card.Card;
import com.etoiledespoir.onlinekvshop.domain.item.image.itemImage;
import com.etoiledespoir.onlinekvshop.domain.item.image.Images;
import com.etoiledespoir.onlinekvshop.service.item.ItemService;
import com.etoiledespoir.onlinekvshop.service.order.card.CardService;
import com.etoiledespoir.onlinekvshop.service.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.item.image.ImagesService;
import com.etoiledespoir.onlinekvshop.service.item.image.ItemImageService;
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
    ItemService itemService;

    @Autowired
    AccountingServce accountingServce;
    @PostMapping("/read")
    public CheckOut read(@RequestBody Card card){
        itemImage item_pictures= item_picturesService.getItemPicture(card.getItemId());
        Items item = itemService.read(card.getItemId());
        Images images=imagesService.read(item_pictures.getImageId());
        Accounting accounting=accountingServce.readwithItemId(card.getItemId());
        double total=calculte(card.getQuantity(),accounting.getPrice());
        CheckOut checkOut=new CheckOut(images.getImage(),item.getDescription(),accounting.getPrice(),card.getQuantity(),total,card.getItemId());
       // System.out.println(checkOut.toString());
        return checkOut;
    }
    public double calculte(int quantity, double price){
        return quantity*price;
    }
}
