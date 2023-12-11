package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int first = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int second = sc.nextInt();
        int sm = first + second;

        System.out.println(first == 6 || second == 6 || sm%6==0);
    }
}
