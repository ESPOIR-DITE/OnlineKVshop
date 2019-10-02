package com.etoiledespoir.onlinekvshop.repository.item;

import java.util.ArrayList;

public interface ItemRepInt <T,t> {
    T insert(T t);
    T read( String id);
    T update(T t);
    T delete(String id);
    ArrayList<T> reads(String itemName);
}
