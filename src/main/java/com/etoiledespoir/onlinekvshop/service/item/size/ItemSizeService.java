package com.etoiledespoir.onlinekvshop.service.item.size;

import com.etoiledespoir.onlinekvshop.domain.item.size.ItemSize;
import com.etoiledespoir.onlinekvshop.repository.item.size.ItemSizeRepo;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ItemSizeService implements Iservice<ItemSize,String> {
    @Autowired
    private ItemSizeRepo itemSizeRepo;
    private static ItemSizeService itemSizeService;


    private ItemSizeService() {
    }
    public ItemSizeService getItemSizeService(){
        if(itemSizeService==null){
            itemSizeService=new ItemSizeService();
        }return itemSizeService;
    }

    @Override
    public ItemSize creat(ItemSize itemSize) {
        return itemSizeRepo.save(itemSize);
    }

    @Override
    public ItemSize delete(String id) {
        Optional<ItemSize> result=itemSizeRepo.findById(id);
        if(read(id).getItemId()!=null){
            itemSizeRepo.deleteById(id);
        }
        return result.orElse(null);
    }

    @Override
    public ItemSize Update(ItemSize itemSize) {
        return itemSizeRepo.save(itemSize);
    }

    @Override
    public ItemSize read(String id) {
        Optional<ItemSize> result=itemSizeRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemSize> readAll() {
        return itemSizeRepo.findAll();
    }

    public ItemSize readWithItemId(String itemId){
        for(ItemSize itemSize :readAll()){
            if(itemSize.getItemId().equals(itemId)){
                return itemSize;
            }
        }
        return null;
    }
    public List<ItemSize> productSizeList(String itemId){
        List<ItemSize> itemSizes =new ArrayList<>();
        for(ItemSize itemSize :readAll()){
            if(itemSize.getItemId().equals(itemId)){
                itemSizes.add(itemSize);
            }
        }
        return itemSizes;
    }

    public Boolean deleteAllOf(String itemId){
        Boolean result= false;
        for (ItemSize sizeId:readAll()){
            if (sizeId.getItemId().equals(itemId)){
                ItemSize itemSize1 =delete(sizeId.getId());
                if (itemSize1 !=null){
                    result= true;
                }
            }
        }return result;
    }
    public Boolean createAll(ArrayList<ItemSize> itemSize){
        boolean toreturn= false;
        for (ItemSize ps: itemSize){
            System.out.println(ps);
            if(ps!=null){
                ItemSize result=creat(ps);
                if (result!=null){
                    toreturn=true;
                }
            }
        }return toreturn;
    }
}
