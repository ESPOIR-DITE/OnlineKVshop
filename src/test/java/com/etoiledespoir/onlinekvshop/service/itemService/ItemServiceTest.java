package com.etoiledespoir.onlinekvshop.service.itemService;

import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemFactory;
import com.etoiledespoir.onlinekvshop.factory.service.ItemServiceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ItemServiceTest {
    private ItemService itemService= ItemServiceFactory.getItem();
    private Item item= ItemFactory.builItem("100012","trico","cloth");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getItemService() {
        Assert.assertNotNull(itemService);
    }

    @Test
    public void creat() {
        System.out.println(itemService.creat(item).toString());
    }

    @Test
    public void delete() {
        System.out.println(itemService.delete("100013"));
    }

    @Test
    public void update() {
        System.out.println(itemService.Update(item).toString());
    }

    @Test
    public void read() {
        System.out.println(itemService.read("100012").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String> myList=new ArrayList<>();
        myList=itemService.readAll();
        for(int i=0;i<myList.size();i++)
        {
        System.out.println(myList.get(i));}
    }

    @Test
    public void getPremier() {
    }
}