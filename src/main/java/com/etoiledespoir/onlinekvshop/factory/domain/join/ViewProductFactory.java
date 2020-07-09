package com.etoiledespoir.onlinekvshop.factory.domain.join;

import com.etoiledespoir.onlinekvshop.domain.ViewProduct;
import com.etoiledespoir.onlinekvshop.domain.item.color.Color;

import java.util.ArrayList;

public class ViewProductFactory {
    public static ViewProduct getViewProduct(String itemId, String itemName, String itemBrand, double price, String description, int quantity, ArrayList<Color>colors,ArrayList<byte[]>pictures){
        return new ViewProduct.Builder(itemId).buildQuantity(quantity).buildDescription(description).buildColors(colors).buildItemBrand(itemBrand).buildPrice(price).buildItemName(itemName).buildPictures(pictures).build();
    }
}
