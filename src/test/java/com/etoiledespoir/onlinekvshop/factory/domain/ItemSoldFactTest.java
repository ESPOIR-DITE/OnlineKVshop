package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.ItemSold;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemSoldFactTest {

    private ItemSold itemSold=ItemSoldFact.getItemS(1213,3443432,234324);
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getItemS() {
        Assert.assertNotNull(itemSold);
    }
}