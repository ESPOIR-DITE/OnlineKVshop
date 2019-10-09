package com.etoiledespoir.onlinekvshop.repository.item.category.hair.impl;

public class HairRepository{}/** implements ItemRepInt<Hair,String> {
private static HairRepository beauty;
private ArrayList<Hair>mydb=new ArrayList<>();

public HairRepository() {
        }
public static HairRepository getBeauty(){
        if(beauty==null){
        beauty=new HairRepository();
        }return beauty;
        }

@Override
public Hair insert(Hair b) {
    Hair result=findOne(b.getItem().getItemNumber());
        if(result==null){
        mydb.add(b);
        return b;
        }
        return null;
        }

@Override
public Hair read(String id) {
    Hair result=findOne(id);
        if(result!=null){

        return result;
        }
        return null;
        }

@Override
public Hair update(Hair b) {
    Hair result=findOne(b.getItem().getItemNumber());
        if(result!=null){
        delete(result.getItem().getItemNumber());
        mydb.add(b);
        return b;
        }
        return null;
        }

@Override
public Hair delete(String id) {
    Hair result=findOne(id);
        if(result!=null){
        mydb.remove(result);
        return result;
        }
        return null;
        }

@Override
public ArrayList<Hair> reads(String itemName) {
        return mydb;
        }
public Hair findOne(String id){
        return mydb.stream().filter(B -> B.getItem().getItemNumber().equals(id))
        .findAny()
        .orElse(null);
        }
        }

*/