package com.etoiledespoir.onlinekvshop.service;

import java.util.ArrayList;
import java.util.List;

public interface Iservice<T ,t> {
    T creat(T t);
    T delete(String id);
    T Update(T t);
    T read(String id);
    List<T> readAll();
}
