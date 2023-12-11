package com.itheima.logiccoperator;

public class logiccoperatorDemo1 {
    public static void main(String[] args) {
        // And : &
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        // Or : |
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        // Either ^ 相同为false，不同为true；
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // Not ! 取反
        System.out.println(!true);
        System.out.println(!false);

        //短路逻辑运算符
        // &&
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // ||
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //演示短路效果
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b <5;
        System.out.println(a);
        System.out.println(b);

    }
}
