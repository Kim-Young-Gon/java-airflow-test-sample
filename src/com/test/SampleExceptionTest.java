package com.test;

public class SampleExceptionTest {
    public static void main(String args[]) throws Exception {
        System.out.println("SampleExceptionTest ====> start");
        for (int i = 0; i < 60; i++) {
            if (i == 50) {
                throw new Exception("Test Exception");
            }
            System.out.println("SampleExceptionTest ====> [" + i + "]");
            Thread.sleep(1000);
        }
        System.out.println("SampleExceptionTest ====> end");
    }
}
