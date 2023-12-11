package com.itheima.switchdemo;

public class switchDemo3 {
    public static void main(String[] args) {
        /*
        case穿透
        执行中如果没有遇到break，会一直执行下面case的内容，无需满足下面case条件
         */
        int number = 1;
        switch (number) {
            case 1:
                System.out.println(1);
                //break;
            case 10:
                System.out.println(10);
                //break;
            case 20:
                System.out.println(20);
                break;
            default:
                System.out.println(100);
                break;
        }
    }
}
