package com.etoiledespoir.onlinekvshop.controller;

import java.util.ArrayList;

public interface Icontroller<T,t> {
    T create(T t);
    T read(String id);
    T update(T t);
    T delete(String id);
    ArrayList<String> readAll();

}
