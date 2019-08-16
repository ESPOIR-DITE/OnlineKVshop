package com.etoiledespoir.onlinekvshop.repository.itemsold;

import com.etoiledespoir.onlinekvshop.domain.ItemSold;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemSoldFact;
import com.etoiledespoir.onlinekvshop.factory.repository.SoldeRepFact;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ItemSoldRepTest {

    private ItemSoldRep itemSR= SoldeRepFact.getItemSold();
    private ItemSold itemSold= ItemSoldFact.getItemS(134,23434,3434);
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getItemSold() {
    }

    @Test
    public void creat() {
        System.out.println(itemSR.creat(itemSold).toString());
    }

    @Test
    public void delete() {
       System.out.println(itemSR.delete("1000").toString());
        /**ArrayList<ItemSold>myList=new ArrayList<>();
        myList=itemSR.delete2("1000");
        for(int i=0;i<myList.size();i++){
        System.out.println(myList.get(i));}
         */
    }
    @Test
    public void read() {
        System.out.println(itemSR.read("1000").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=itemSR.readAll();
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }

    @Test
    public void getPremier() {
    }

    @Test
    public void update() {
    }


    @Test
    public void readAllThat() {
    }

    @Test
    public void getPremier1() {
    }
}