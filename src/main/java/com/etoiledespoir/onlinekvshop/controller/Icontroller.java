package com.etoiledespoir.onlinekvshop.controller;

import java.util.ArrayList;
import java.util.List;

public interface Icontroller<T,t> {
    T create(T t);
    T read(String id);
    T update(T t);
    T delete(String id);
    List<T> readAll();

}
