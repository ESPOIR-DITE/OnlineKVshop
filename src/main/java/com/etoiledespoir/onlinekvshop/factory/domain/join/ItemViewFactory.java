package com.etoiledespoir.onlinekvshop.factory.domain.join;

import com.etoiledespoir.onlinekvshop.domain.joins.ItemView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * this class will provide an object that contains an aggregated data for item verifficatiobn
 */
public class ItemViewFactory {
    public static ItemView getItemView(String itemNumber,String productName,String description, byte[] image,double price){
        return new ItemView.Builder(itemNumber).buildPrice(price).buildDescription(description).buildImage(image).buildProductName(productName).build();
    }

}
