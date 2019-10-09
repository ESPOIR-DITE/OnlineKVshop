package com.etoiledespoir.onlinekvshop.repository.item.category.shoes.impl;

public class ShoesRep{}/** implements ItemRepInt<Shoes,String> {
    private static ShoesRep beauty;
    private ArrayList<Shoes>mydb=new ArrayList<>();

    public ShoesRep() {
    }
    public static ShoesRep getBeauty(){
        if(beauty==null){
            beauty=new ShoesRep();
        }return beauty;
    }

    @Override
    public Shoes insert(Shoes b) {
        Shoes result=findOne(b.getItem().getItemNumber());
        if(result==null){
            mydb.add(b);
            return b;
        }
        return null;
    }

    @Override
    public Shoes read(String id) {
        Shoes result=findOne(id);
        if(result!=null){

            return result;
        }
        return null;
    }

    @Override
    public Shoes update(Shoes b) {
        Shoes result=findOne(b.getItem().getItemNumber());
        if(result!=null){
            delete(result.getItem().getItemNumber());
            mydb.add(b);
            return b;
        }
        return null;
    }

    @Override
    public Shoes delete(String id) {
        Shoes result=findOne(id);
        if(result!=null){
            mydb.remove(result);
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<Shoes> reads(String itemName) {
        return mydb;
    }
    public Shoes findOne(String id){
        return mydb.stream().filter(B -> B.getItem().getItemNumber().equals(id))
                .findAny()
                .orElse(null);
    }
}
*/