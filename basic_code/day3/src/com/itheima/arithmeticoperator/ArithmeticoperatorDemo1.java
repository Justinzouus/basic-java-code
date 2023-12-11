package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3+2);
        // -
        System.out.println(5-1);
        // *
        System.out.println(7*8);
        // 在有小数运算的时候可能结果会不准确
        // /
        System.out.println(10/2);
        System.out.println(10/3); //整数参与计算只能得到整数结果
        System.out.println(10.0/3);
        // %
        System.out.println(10%2);
        System.out.println(10%3);

        byte b1 = 100;
        byte b2 = 100;
        byte result = (byte)(b1+b2);
        System.out.println(result);

        System.out.println("abc"+123+0.6);
        System.out.println(1+2+"star"+1+2);
    }
}
