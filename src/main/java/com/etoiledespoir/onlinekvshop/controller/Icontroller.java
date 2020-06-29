package com.etoiledespoir.onlinekvshop.controller;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.List;

public interface Icontroller<T,t> {
    T create(T t) throws UnirestException;
    T read(String id);
    T update(T t);
    T delete(String id);
    List<T> readAll();

}
