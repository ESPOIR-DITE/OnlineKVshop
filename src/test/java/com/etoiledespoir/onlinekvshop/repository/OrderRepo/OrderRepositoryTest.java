package com.etoiledespoir.onlinekvshop.repository.OrderRepo;

import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.domain.ItemSold;
import com.etoiledespoir.onlinekvshop.domain.Order;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemSoldFact;
import com.etoiledespoir.onlinekvshop.factory.domain.OrderFactory;
import com.etoiledespoir.onlinekvshop.factory.repository.OrderRepFactory;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderRepositoryTest {

    private OrderRepository Or= OrderRepFactory.getOrder();
    private ItemSold item,item2,item3;
    private ArrayList<ItemSold> myList=new ArrayList<>();




    private Order order;
    @Before
    public void setUp() throws Exception {
        item= ItemSoldFact.getItemS(1000,0001,23213);
        item2= ItemSoldFact.getItemS(1223,1232,23213);
        item3= ItemSoldFact.getItemS(1223,1232,23213);
        myList.add(item);
       // myList.add(item2);
       // myList.add(item3);
        order= OrderFactory.buildOrder("1000",1000,myList, CurrentDate.getCurrentTimeUsingDate());
    }

    @Test
    public void getOrd() {
       // Assert.assertNotNull(Or);
        Assert.assertNotNull(order);
    }

    @Test
    public void creat() {
        System.out.println(Or.creat(order).toString());
    }

    @Test
    public void delete() {
        System.out.println(Or.delete("1001").toString());
    }

    @Test
    public void update() {
        System.out.println(Or.Update(order));
    }

    @Test
    public void read() {
        System.out.println(Or.read("1000").toString());
       // System.out.println(Or.read("1000").getItems().get(0));
    }

    @Test
    public void readAll() {
        ArrayList<String>myList=new ArrayList<>();
        myList=Or.readAll();
        for(int i=0; i<myList.size();i++){
        System.out.println(Or.readAll().get(i)+"\n");}
    }

    @Test
    public void getPremier() {
    }
}