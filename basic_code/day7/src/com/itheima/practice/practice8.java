package com.itheima.practice;

import java.util.Random;
import java.util.Scanner;

public class practice8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] red = new int[6];
        int blue = r.nextInt(16) + 1;
        for (int i = 0; i < red.length; i++) {
            red[i] = r.nextInt(34) + 1;
        }

        for (int i = 0; i < red.length; i++) {
            System.out.print(red[i] + " ");
        }
        System.out.println(blue);

        int[] guessred = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < guessred.length; i++) {
            System.out.println("请输入第 " + (i+1) + " 个红色球数字：");
            guessred[i] = sc.nextInt();
        }
        System.out.println("请输入一个蓝色球数字：");
        int guessblue = sc.nextInt();

        int countred = 0;
        int countblue = 0;

        if (blue == guessblue) {
            countblue += 1;
        }

        for (int i = 0; i < guessred.length; i++) {
            for (int j = 0; j < red.length; j++) {
                if (guessred[i] == red[j]){
                    red[j] = -1;
                    countred ++;
                    break;
                }
            }
        }

        if (countred == 6 && countblue == 1){
            System.out.println("一等奖");
        }
        else if (countred == 6 && countblue == 0) {
            System.out.println("二等奖");
        }
        else if (countred == 5 && countblue == 1) {
            System.out.println("三等奖");
        }
        else if (countred == 5 && countblue == 0) {
            System.out.println("三等奖");
        }
        else if (countred == 4 && countblue == 1) {
            System.out.println("四等奖");
        }
        else if (countred == 4 && countblue == 0) {
            System.out.println("四等奖");
        }
        else if (countred == 3 && countblue == 1) {
            System.out.println("五等奖");
        }
        else if (countred == 2 && countblue == 1) {
            System.out.println("五等奖");
        }
        else if (countred == 1 && countblue == 1) {
            System.out.println("六等奖");
        }
        else if (countred == 0 && countblue == 1) {
            System.out.println("六等奖");
        }
        else {
            System.out.println("没中奖");
        }
    }

}
