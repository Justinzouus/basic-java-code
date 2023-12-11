package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        int x = sc.nextInt();

        for (int i = 1;; i++){
            if (x/i < i){
                System.out.println("整数根为" + (i-1));
                break;
            }
        }
    }
}
