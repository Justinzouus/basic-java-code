package com.itheima.practice;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        int max = score[0];
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        double result = (double)(sum - max - min)/4;
        System.out.println(result);
    }
}
