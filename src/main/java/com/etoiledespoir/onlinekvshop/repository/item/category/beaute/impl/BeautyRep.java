package com.etoiledespoir.onlinekvshop.repository.item.category.beaute.impl;

public class BeautyRep{} /**implements ItemRepInt<BeautyMakeup,String> {
    private static BeautyRep beauty;
    private ArrayList<BeautyMakeup>mydb=new ArrayList<>();

    public BeautyRep() {
    }
    public static BeautyRep getBeauty(){
        if(beauty==null){
            beauty=new BeautyRep();
        }return beauty;
    }

    @Override
    public BeautyMakeup insert(BeautyMakeup b) {
        BeautyMakeup result=findOne(b.getItem().getItemNumber());
        if(result==null){
            mydb.add(b);
            return b;
        }
        return null;
    }

    @Override
    public BeautyMakeup read(String id) {
        BeautyMakeup result=findOne(id);
        if(result!=null){

            return result;
        }
        return null;
    }

    @Override
    public BeautyMakeup update(BeautyMakeup b) {
        BeautyMakeup result=findOne(b.getItem().getItemNumber());
        if(result!=null){
            delete(result.getItem().getItemNumber());
            mydb.add(b);
            return b;
        }
        return null;
    }

    @Override
    public BeautyMakeup delete(String id) {
        BeautyMakeup result=findOne(id);
        if(result!=null){
            mydb.remove(result);
            return result;
        }
        return null;
    }

    @Override
    public ArrayList<BeautyMakeup> reads(String itemName) {
        return mydb;
    }
    public BeautyMakeup findOne(String id){
        return mydb.stream().filter(B -> B.getItem().getItemNumber().equals(id))
                .findAny()
                .orElse(null);
    }
}
*/