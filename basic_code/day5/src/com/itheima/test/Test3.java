package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                System.out.println("合数");
                flag = false;
                break;
            }
        }

        if (flag == true){
            System.out.println("质数");
        }

    }
}
