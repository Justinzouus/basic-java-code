package com.itheima.test;

public class test3 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        System.out.println(findExist(n,arr));

        int[] arr1 = copyOfRange(arr,2,4);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }
    public static boolean findExist(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] result = new int[to-from];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i+from];
        }
        return result;
    }
}
