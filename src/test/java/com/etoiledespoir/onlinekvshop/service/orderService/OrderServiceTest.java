package com.etoiledespoir.onlinekvshop.service.orderService;

import com.etoiledespoir.onlinekvshop.domain.ItemSold;
import com.etoiledespoir.onlinekvshop.domain.order.Order;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemSoldFact;
import com.etoiledespoir.onlinekvshop.factory.domain.OrderFactory;
import com.etoiledespoir.onlinekvshop.factory.repository.OrderRepFactory;
import com.etoiledespoir.onlinekvshop.factory.service.OrderServiceFacto;
import com.etoiledespoir.onlinekvshop.repository.OrderRepo.OrderRepository;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class OrderServiceTest {
    private OrderService orderServiceFacto=OrderServiceFacto.getOrderServis();
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
        myList.add(item2);
         myList.add(item3);
        order= OrderFactory.buildOrder("1000",1000,myList, CurrentDate.getCurrentTimeUsingDate());
    }

    @Test
    public void getOrder() {
       // Assert.assertNotNull(order);
       // Assert.assertNotNull(Or);
        Assert.assertNotNull(orderServiceFacto);
    }

    @Test
    public void creat() {
        System.out.println(orderServiceFacto.creat(order).toString());
    }

    @Test
    public void delete() {
        System.out.println(orderServiceFacto.delete("1002").toString());
    }


    @Test
    public void read() {
        System.out.println(orderServiceFacto.read("1000").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String> myList = new ArrayList<>();
        myList = orderServiceFacto.readAll();
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(orderServiceFacto.readAll().get(i) + "\n");
        }

    }

    @Test
    public void update() {
    }



    @Test
    public void getPremier() {
    }
}