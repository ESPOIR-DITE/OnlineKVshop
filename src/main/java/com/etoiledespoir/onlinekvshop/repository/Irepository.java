package com.etoiledespoir.onlinekvshop.repository;

import java.util.ArrayList;

public interface Irepository<T,t> {
    T creat(T t);
    T delete(String id);
    T Update(T t);
    T read(String id);
    ArrayList<String> readAll();
    String getPremier();
}
