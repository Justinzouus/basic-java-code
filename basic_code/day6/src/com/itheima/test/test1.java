package com.itheima.test;

public class test1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printLine(arr);
    }

    public static void printLine(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
