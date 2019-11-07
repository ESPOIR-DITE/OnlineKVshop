package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrderLineFactoryTest {
    OrderLine line =OrderLineFactory.getLine("2333","234","");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getLine() {
        Assert.assertNotNull(line);
    }
}