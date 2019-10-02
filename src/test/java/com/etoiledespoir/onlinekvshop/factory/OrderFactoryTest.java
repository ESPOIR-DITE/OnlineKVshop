package com.etoiledespoir.onlinekvshop.factory;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.domain.ItemSold;
import com.etoiledespoir.onlinekvshop.domain.order.Order;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemSoldFact;
import com.etoiledespoir.onlinekvshop.factory.domain.OrderFactory;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class OrderFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void buildOrder() {
         ArrayList<ItemSold>list= new ArrayList<>();
         list.add(ItemSoldFact.getItemS(12312,2323,43545));
        list.add(ItemSoldFact.getItemS(12312,232433,4354435));
        //System.out.println(item.toString());

         Customer customer= CustomerFactory.buildCustomer("espoir",3902,"espoire@djfddm","skjdfdfsd","parow","ready");
        //System.out.println(customer.toString());

        Order order= OrderFactory.buildOrder("37459",1000,list, CurrentDate.getCurrentTimeUsingDate());
        System.out.println(order.toString());


       // Order order= OrderFactory.buildOrder()
    }
}