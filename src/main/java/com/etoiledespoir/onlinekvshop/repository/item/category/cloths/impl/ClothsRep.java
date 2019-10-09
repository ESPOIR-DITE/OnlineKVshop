package com.etoiledespoir.onlinekvshop.repository.item.category.cloths.impl;

public class ClothsRep{} /**implements ItemRepInt<Cloths,String> {
    private static ClothsRep item;
    private ArrayList<Cloths> mydb=new ArrayList<>();

    public ClothsRep() {
    }
    public static ClothsRep getBeauty(){
        if(item==null){
            item=new ClothsRep();
        }return item;
    }

    @Override
    public Cloths insert(Cloths b) {
        Cloths result=findOne(b.getItem().getItemNumber());
        if(result==null){
            mydb.add(b);
            return b;
        }
        return null;
    }

    @Override
    public Cloths read(String id) {
        Cloths result=findOne(id);
        if(result!=null){

            return result;
        }
        return null;
    }

    @Override
    public Cloths update(Cloths b) {
        Cloths result=findOne(b.getItem().getItemNumber());
        if(result!=null){
            delete(result.getItem().getItemNumber());
            mydb.add(b);
            return b;
        }
        return null;
    }

    @Override
    public Cloths delete(String id) {
        Cloths result=findOne(id);
        if(result!=null){
            mydb.remove(result);
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Cloths> reads(String itemName) {
        return mydb;
    }
    public Cloths findOne(String id){
        return mydb.stream().filter(B -> B.getItem().getItemNumber().equals(id))
                .findAny()
                .orElse(null);
    }
}

*/