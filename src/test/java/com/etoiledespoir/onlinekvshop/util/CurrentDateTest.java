package com.etoiledespoir.onlinekvshop.util;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CurrentDateTest {

    @Test
    public void getCurrentTimeUsingDate() {
        String date=CurrentDate.getCurrentTimeUsingDate();
        System.out.println(date);
    }

    @Test
    public void getCurrentDateTime() {
        Date date=CurrentDate.getCurrentDateTime();
        System.out.println(date);
    }
}