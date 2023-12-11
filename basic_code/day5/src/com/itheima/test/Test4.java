package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1; //1-100

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字：");
            int guess = sc.nextInt();

            if (guess > number) {
                System.out.println("大了");
            } else if (guess < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}