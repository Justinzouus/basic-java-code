package com.itheima.methoddemo;

public class methodDemo {
    public static void main(String[] args) {
        playGame();
        summation(30,40);
    }

    public static void playGame() {
        System.out.println("开局");
        System.out.println("准备对线");
        System.out.println("崩盘");
        System.out.println("开喷");
    }

    public static void summation(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
