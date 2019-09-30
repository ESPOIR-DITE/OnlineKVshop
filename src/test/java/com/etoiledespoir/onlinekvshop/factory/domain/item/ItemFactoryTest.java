package com.etoiledespoir.onlinekvshop.factory.domain.item;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.ItemInt;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemFactoryTest {
    ItemInt itemInt= ItemFactory.getItem("hair");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getItem() {
        itemInt.buildDecription("none");
        itemInt.buildgender("male");
        itemInt.buildName("mark");
        itemInt.buildItemNumber("2334");
        itemInt.buildPrice(32343);
        itemInt.buildQuantity(10);
        itemInt.buildSize("M");
        System.out.println(itemInt.getItem().toString());

    }
}