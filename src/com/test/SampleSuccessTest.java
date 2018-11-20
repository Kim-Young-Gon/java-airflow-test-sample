package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SampleSuccessTest {
    public static void main(String args[]) throws Exception {
        System.out.println("SampleSuccessTest ====> start");
        for (int i = 0; i < 60; i++) {
            System.out.println("SampleSuccessTest ====> [" + i + "]");
            Thread.sleep(1000);
        }
        System.out.println("SampleSuccessTest ====> end");
        SimpleDateFormat date = new SimpleDateFormat();
        date.applyPattern("yyyy-MM-dd HH:mm:ss");
        String now = date.format(Calendar.getInstance().getTime());
        int success = (int) Math.round(Math.random() * 1000);
        System.out.println(now + " TEST " + success);
    }
}
