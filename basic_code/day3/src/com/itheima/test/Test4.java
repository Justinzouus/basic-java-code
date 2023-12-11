package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一只老虎的体重：");
        double weight1 = sc.nextDouble();
        System.out.println("第二只老虎的体重：");
        double weight2 = sc.nextDouble();

        System.out.println(weight1 == weight2? "相同":"不同");
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        System.out.println(height1 > height2? (height1 > height3? height1:height3):(height2 > height3? height2:height3));
    }
}
