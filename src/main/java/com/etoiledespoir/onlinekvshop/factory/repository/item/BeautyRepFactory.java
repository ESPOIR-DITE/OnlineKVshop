package com.etoiledespoir.onlinekvshop.factory.repository.item;

import com.etoiledespoir.onlinekvshop.repository.item.ItemRepInt;
import com.etoiledespoir.onlinekvshop.repository.item.impl.BeautyRep;
import com.etoiledespoir.onlinekvshop.repository.item.impl.HairRepository;
import com.etoiledespoir.onlinekvshop.repository.item.impl.ShoesRep;

public class BeautyRepFactory {
    public static ItemRepInt getItem(String itemName){
        switch (itemName) {
            case "hair":
                return HairRepository.getBeauty();
            case "beate":
                    return BeautyRep.getBeauty();
            case "chausure":
                return ShoesRep.getBeauty();
        }return null;
    }
}
