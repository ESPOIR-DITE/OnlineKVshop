package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.repository.ItemRepo.ItemRepositiry;
import com.etoiledespoir.onlinekvshop.service.itemService.ItemService;

public class ItemServiceFactory {
    public static ItemService getItem()
    {
        return ItemService.getItemService();
    }
}
