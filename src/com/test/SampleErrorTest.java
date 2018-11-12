package com.test;

public class SampleErrorTest {
    public static void main(String args[]) throws Exception {
        System.out.println("SampleErrorTest ====> start");
        for (int i = 0; i < 60; i++) {
            if (i == 45) {
                System.out.println("SampleErrorTest ====> ERROR");
                System.exit(1);
            } else {
                System.out.println("SampleErrorTest ====> [" + i + "]");
                Thread.sleep(1000);
            }
        }
        System.out.println("SampleErrorTest ====> end");
    }
}
