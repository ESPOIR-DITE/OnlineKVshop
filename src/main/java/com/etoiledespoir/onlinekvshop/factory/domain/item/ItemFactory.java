package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.ItemInt;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.Items;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Cloths;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Hair;
import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Shoes;

public class ItemFactory {
    public static ItemInt getItem(String item){
        switch (item){
            case "shoes":
                return new Shoes();

            case"hair":
                return new Hair();

            case "cloths":
                return new Cloths();

            case "beaute":
                return new BeautyMakeup();

        } return null;
    }

}
