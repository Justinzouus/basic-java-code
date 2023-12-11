package com.itheima.test;

public class arrayTest1 {
    public static void main(String[] args) {
        int[] array = {33,35,2,24,56};

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
