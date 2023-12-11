package com.itheima.ifdemo;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的酒量：");
        int wine = sc.nextInt();
        if (wine > 2) {
            System.out.println("小伙子酒量不错！");
        }

        //if 的三种格式
        if (wine > 10) {
            System.out.println("a");
        } else if (wine < 5) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}
