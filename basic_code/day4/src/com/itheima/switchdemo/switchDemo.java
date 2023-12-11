package com.itheima.switchdemo;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想吃的面");
        String noodles = sc.next();
        switch (noodles) {
            case "热干面":
                System.out.println("吃热干面");
                break;
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "炸酱面":
                System.out.println("吃炸酱面");
                break;
            case "油泼面":
                System.out.println("吃油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
