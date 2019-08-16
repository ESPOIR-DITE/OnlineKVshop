package com.etoiledespoir.onlinekvshop.repository.ItemRepo;

import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemFactory;
import com.etoiledespoir.onlinekvshop.factory.repository.ItemRepoFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ItemRepositiryTest {

    ItemRepositiry item= ItemRepoFactory.getItem();
    Item itemclass= ItemFactory.builItem("0","sadal","shoes");
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void getItemR() {
        Assert.assertNotNull(itemclass);
    }

    @Test
    public void creat() {

        System.out.println(item.creat(itemclass).toString());
    }

    @Test
    public void delete() {
        System.out.println(item.delete("1000").toString());
    }

    @Test
    public void update() {
        Item itemclas= ItemFactory.builItem("1000","mukoto","shoes");
        System.out.println(item.Update(itemclas).toString());
    }

    @Test
    public void read() {
        System.out.println(item.read("1000"));
    }

    @Test
    public void readAll() {
        ArrayList<String> myList=new ArrayList<>();
        myList=item.readAll();
        for(int i=0;i<myList.size();i++)
        {
            System.out.println(myList.get(i));
        }
    }

    @Test
    public void getPremier() {
        System.out.println(item.getPremier());
    }
}