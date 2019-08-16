package com.etoiledespoir.onlinekvshop.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDate {
    public static String getCurrentTimeUsingDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return formatter.format(calendar.getTime());
    }
}
