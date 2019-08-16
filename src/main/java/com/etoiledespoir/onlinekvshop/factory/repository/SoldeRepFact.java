package com.etoiledespoir.onlinekvshop.factory.repository;

import com.etoiledespoir.onlinekvshop.repository.itemsold.ItemSoldRep;

public class SoldeRepFact {
    public static ItemSoldRep getItemSold(){
        return  ItemSoldRep.getItemSold();
    }
}
