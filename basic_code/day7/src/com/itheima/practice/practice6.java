package com.itheima.practice;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int password = sc.nextInt();
        int count = 0;
        for (int i = 10; i < password * 10; i = i * 10) {
            count ++;
        }

        int[] arr = new int[count];
        int[] result = new int[count];

        for (int i = count-1, j = 1; i >= 0; i--,j = j * 10) {
            arr[i] = (password/j) % 10;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] = arr[i]%10;
            result[count-i-1] = arr[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
