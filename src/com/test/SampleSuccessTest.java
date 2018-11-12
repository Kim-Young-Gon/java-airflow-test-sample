package com.test;

public class SampleSuccessTest {
    public static void main(String args[]) throws Exception {
        System.out.println("SampleSuccessTest ====> start");
        for (int i = 0; i < 60; i++) {
            System.out.println("SampleSuccessTest ====> [" + i + "]");
            Thread.sleep(1000);
        }
        System.out.println("SampleSuccessTest ====> end");
    }
}
