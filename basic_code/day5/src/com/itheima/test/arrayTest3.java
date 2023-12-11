package com.itheima.test;

public class arrayTest3 {
    public static void main(String[] args) {
        //1. First create an array with number 1,2,3,4,5.
        int[] arr = {1,2,3,4,5};
        //Create a new array to store the index.
        int[] index = {5,2,3,4,1};
        //2. Create a new array and put the value in respectively
        int[] temp = new int[5];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[index[i]-1];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

        int[] arr1 = {1,2,3,4,5};
        for (int i = 0, j = arr1.length - 1; i < j;i++,j--) {
            int temp1 = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp1;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
