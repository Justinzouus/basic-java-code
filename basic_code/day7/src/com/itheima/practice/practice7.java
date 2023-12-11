package com.itheima.practice;

import java.util.Random;

public class practice7 {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};
        int[] arr1 = new int[arr.length];

        Random r = new Random();
        boolean flag = true;

        for (int i = 0; i < arr1.length;) {
            int number = r.nextInt(5);
            for (int j = 0; j < arr1.length; j++) {
                if (arr[number] == arr1[j]){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("价值 " + arr[number] + " 的红包已被抽出。");
                arr1[i] = arr[number];
                i++;
            }
            else {
                flag = true;
            }
        }
    }
}
