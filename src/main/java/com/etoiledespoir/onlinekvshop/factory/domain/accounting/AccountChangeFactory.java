package com.etoiledespoir.onlinekvshop.factory.domain.accounting;

import com.etoiledespoir.onlinekvshop.domain.accounting.accountChange.AccountChange;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class AccountChangeFactory {
    public static AccountChange getAccount(String itemId,String date,int intialquantity,int postQuantity,String decs){
        return new AccountChange.Builder(Igenerator.getSuffixFromClassName(AccountChangeFactory.class))
                .buildDate(date)
                .buildItemId(itemId)
                .buildInitialQuantity(intialquantity)
                .buildPostQuantity(postQuantity)
                .buildDescription(decs)
                .build();
    }
}
