package com.etoiledespoir.onlinekvshop.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrentDateTest {

    @Test
    public void getCurrentTimeUsingDate() {
        String date=CurrentDate.getCurrentTimeUsingDate();
        System.out.println(date);
    }
}