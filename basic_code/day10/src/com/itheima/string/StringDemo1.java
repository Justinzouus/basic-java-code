package com.itheima.string;

public class StringDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(connect(arr));
    }
    public static String connect(int[] arr){
        if (arr == null) {
            return "";
        }
        if (arr.length == 0){
            return "[]";
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else{
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        return result;
    }
}
