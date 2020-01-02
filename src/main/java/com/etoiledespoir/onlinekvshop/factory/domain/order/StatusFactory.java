package com.etoiledespoir.onlinekvshop.factory.domain.order;

import com.etoiledespoir.onlinekvshop.domain.order.Status;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class StatusFactory {
    public static Status getStatus(String stat){
        return new Status.Builder(Igenerator.getSuffixFromClassName(StatusFactory.class))
                .buildStat(stat)
                .build();
    }
}
