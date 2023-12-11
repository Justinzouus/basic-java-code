package com.itheima.arraydemo;

public class arrayDemo {
    public static void main(String[] args) {

        //静态初始化
        //完整格式：
        //数据类型 [] 数组名 = new 数据类型 []{元素1,元素2,...}
        int[] student= {12,13,15,16,15};

        String[] arr2 = {"tim","tom"};

        double[] arr = {2.14,3.14};

        System.out.println(arr);//地址值
        System.out.println(arr[0]);

        arr[0] = 100;
        System.out.println(arr[0]);

        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        // 快捷方式 ： arr.fori

        //动态初始化
        String [] arr3 = new String[50];
        arr3[0] = "Tom";
        arr3[1] = "Tim";
        System.out.println(arr3[0]);
        System.out.println(arr3[2]);
    }
}
