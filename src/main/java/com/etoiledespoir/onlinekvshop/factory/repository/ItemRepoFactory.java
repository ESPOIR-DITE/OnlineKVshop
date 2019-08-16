package com.etoiledespoir.onlinekvshop.factory.repository;

import com.etoiledespoir.onlinekvshop.repository.ItemRepo.ItemRepositiry;

public class ItemRepoFactory {
    public static ItemRepositiry getItem(){
        return ItemRepositiry.getItemR();
    }
}
