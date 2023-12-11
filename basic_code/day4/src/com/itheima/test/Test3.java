package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //定义被除数和除数
        int divisor = 10;
        int dividend = 100;

        int temp = dividend;
        int count = 0;
        int leftover = 0;
        //写一个while循环，每次减掉一次除数，计算次数作为商，同时返回最后剩余的值作为余数
        while (temp >= divisor) {
            temp -= divisor;
            count++;
            leftover = temp;
        }
        System.out.println(count);
        System.out.println(leftover);
    }
}
