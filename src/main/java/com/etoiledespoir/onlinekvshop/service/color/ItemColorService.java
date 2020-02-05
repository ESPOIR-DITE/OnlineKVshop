package com.etoiledespoir.onlinekvshop.service.color;

import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;
import com.etoiledespoir.onlinekvshop.factory.domain.color.impl.ItemColorFactory;
import com.etoiledespoir.onlinekvshop.repository.color.ItemColorRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ItemColorService implements Iservice<ItemColor,String> {
    private static ItemColorService itemColorService=null;
    @Autowired
    ItemColorRep itemColorRep;

    private ItemColorService() {
    }
    public static ItemColorService getItemColorService(){
        if(itemColorService==null){
            itemColorService=new ItemColorService();
        }return itemColorService;
    }

    @Override
    public ItemColor creat(ItemColor itemColor) {
        return itemColorRep.save(itemColor);
    }

    @Override
    public ItemColor delete(String id) {
        Optional<ItemColor> result=itemColorRep.findById(id);
        itemColorRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public ItemColor Update(ItemColor itemColor) {
        return itemColorRep.save(itemColor);
    }

    @Override
    public ItemColor read(String id) {
        Optional<ItemColor> result=itemColorRep.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<ItemColor> readAll() {
        return itemColorRep.findAll();
    }

    /**
     * this method creates item colors from data provided by the controller
     * @param colorId
     * @param itemId
     */
    public void creatList(String colorId,String itemId){
            ItemColor result= ItemColorFactory.getItemColer(itemId,colorId);
            creat(result);
    }
    public ArrayList<ItemColor> getColorIdList(String itemID){
        ArrayList<ItemColor> colorIds=new ArrayList<>();
        for(ItemColor itemColor:readAll()){
            if(itemColor.getItemId().equals(itemID)){
                colorIds.add(itemColor);
            }
        }
        return colorIds;
    }
    public Boolean DeleteAllOfItem(String itemId){
        boolean result= false;
        for(ItemColor itemColor:readAll()){
            if(itemColor.getItemId().equals(itemId)){
                ItemColor itemColor1=delete(itemColor.getId());
                if (itemColor1!=null) {
                    result = true;
                }
            }
        }return result;
    }
    public Boolean CreateAllOf(ArrayList<ItemColor> itemColorArrayList){
        boolean result= false;
        for(ItemColor itemColor:itemColorArrayList){
            if(itemColor!=null){
                ItemColor itemColor1=creat(itemColor);
                if (itemColor1!=null) {
                    result = true;
                }
            }
        }return result;
    }
}
