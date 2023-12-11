package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度（0-10）：");
        int you = sc.nextInt();
        System.out.println("请输入你约会对象的时髦度（0-10）：");
        int her = sc.nextInt();
        System.out.println(you > her);
    }
}
