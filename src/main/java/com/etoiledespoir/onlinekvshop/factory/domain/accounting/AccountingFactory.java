package com.etoiledespoir.onlinekvshop.factory.domain.accounting;

import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;

public class AccountingFactory {
    public static Accounting getAccounting(String itemId,double price,int quantity){
        return new Accounting.Builder(itemId).buildPrice(price).buildQuality(quantity).build();
    }
}
