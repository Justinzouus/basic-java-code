package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {

        //回文
        int x = 12345;
        int temp = x;
        int y = 0;

        while (temp >= 1) {
            int v = temp % 10;
            y = (y*10)+v;
            temp /= 10;
        }

        System.out.println(y);
    }
}
