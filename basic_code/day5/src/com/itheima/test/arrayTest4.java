package com.itheima.test;

import java.util.Random;

public class arrayTest4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = r.nextInt(arr.length);
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + arr.length);
    }
}
