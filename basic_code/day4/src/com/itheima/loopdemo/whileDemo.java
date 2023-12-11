package com.itheima.loopdemo;

public class whileDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i<=100) {
            System.out.println(i);
            i++;
        }

        double start = 0.1;
        int count = 0;
        while (start <= 8844430) {
            start *= 2;
            count++;
        }
        System.out.println(count);
    }
}
