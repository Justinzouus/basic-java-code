package com.itheima.string;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true){
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999){
                break;
            } else {
                System.out.println("金额无效");
            }
        }
        String str = capitalNumber(3);
    }

    public static String capitalNumber(int number){
        //创建一个数组，存储中文的数字
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
