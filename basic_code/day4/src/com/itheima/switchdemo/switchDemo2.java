package com.itheima.switchdemo;

public class switchDemo2 {
    public static void main(String[] args) {
        /*
        default的位置和省略
        位置可以调整，但习惯写在最下面
        default可以省略，系统不做任何操作

         */
        int number = 1;
        switch (number) {
            case 1:
                System.out.println(1);
                break;
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            default:
                System.out.println();
                break;
        }
    }
}
