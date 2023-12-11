package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入范围下限：");
        int lower = sc.nextInt();
        System.out.println("请输入范围上限：");
        int upper = sc.nextInt();
        int count = 0;

        for (int i = lower;i <= upper; i++){
            if (i%3 == 0 & i%5==0) {
             }
        }
        System.out.println(count);

    }
}
