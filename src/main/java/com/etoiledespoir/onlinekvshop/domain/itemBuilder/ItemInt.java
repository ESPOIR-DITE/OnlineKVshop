package com.etoiledespoir.onlinekvshop.domain.itemBuilder;

import java.awt.*;

public interface ItemInt {
     void buildItemNumber(String itemNumber);
    void buildName(String itemName);
    void buildtype(String itemType);
    void buildSize(String size);
    void buildgender(String itemGender);
    void buildDecription(String description);
    //void buildImage(Image image);
   void buildPrice(double price);
    void buildQuantity(int quantity);
     Items getItem();
}
