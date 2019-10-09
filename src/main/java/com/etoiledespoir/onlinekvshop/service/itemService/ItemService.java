package com.etoiledespoir.onlinekvshop.service.itemService;

import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.repository.ItemRepo.ItemRepositiry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService{}/** implements IitemService {
    private static ItemService itemService;
    private ItemRepositiry item= ItemRepoFactory.getItem();

    private ItemService() {
    }

    public static ItemService getItemService() {
        if(itemService==null) {
            itemService=new ItemService();
        }return itemService;

    }

    @Override
    public Item creat(Item item) {
        return this.item.creat(item);
    }

    @Override
    public Item delete(String id) {
        return this.item.delete(id);
    }

    @Override
    public Item Update(Item item) {
        return this.item.Update(item);
    }

    @Override
    public Item read(String id) {
        return this.item.read(id);
    }

    @Override
    public ArrayList<String> readAll() {
        return this.item.readAll();
    }

    @Override
    public String getPremier() {
        return null;
    }
}
*/