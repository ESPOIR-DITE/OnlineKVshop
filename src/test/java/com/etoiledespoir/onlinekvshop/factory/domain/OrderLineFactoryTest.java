package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.OrderLine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderLineFactoryTest {
    OrderLine line =OrderLineFactory.getLine("2333","234","234324","23424");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getLine() {
        Assert.assertNotNull(line);
    }
}