package com.etoiledespoir.onlinekvshop.factory;

import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemFactory;
import org.junit.Before;
import org.junit.Test;

public class ItemFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void builItem() {
        Item item= ItemFactory.builItem("23434","pelisaNgasuma","cloth");
        item.toString();
        System.out.println(item.toString());
    }
}