package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int i = sc.nextInt();
        int digit = i%10;
        int ten = i/10%10;
        int hundred = i/100%10;
        System.out.println(digit);
        System.out.println(ten);
        System.out.println(hundred);
        System.out.println("个位数是:"+digit);
        System.out.println("十位数是:"+ten);
        System.out.println("百位数是:"+hundred);
    }
}
