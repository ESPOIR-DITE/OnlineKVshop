package com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.ItemInt;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.Items;

import java.awt.*;

public class Hair implements ItemInt {
    private Items items;

    public Hair() {
        items=new Items();
    }


    @Override
    public void buildItemNumber(String itemNumber) {
        items.setItemNumber(itemNumber);
    }

    @Override
    public void buildName(String itemName) {
        items.setName(itemName);
    }

    @Override
    public void buildtype(String itemType) {
        items.setType(itemType);
    }

    @Override
    public void buildSize(String size) {
        items.setSize(size);
    }

    @Override
    public void buildgender(String itemGender) {
        items.setGender(itemGender);
    }

    @Override
    public void buildDecription(String description) {
        items.setDecription(description);
    }

    @Override
    public void buildPrice(double price) {
        items.setPrice(price);
    }

    @Override
    public void buildQuantity(int quantity) {
        items.setQuantity(quantity);
    }

    @Override
    public Items getItem() {
        return items;
    }
}
