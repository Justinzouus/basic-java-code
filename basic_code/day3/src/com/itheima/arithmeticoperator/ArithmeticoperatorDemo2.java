package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        char c = 'a';
        int result = c + 0;
        System.out.println(result);
        int a = 10;
        a++;
        ++a;
        System.out.println(a);
        a--;
        --a;
        System.out.println(a);

        int x = 10;
        int y = x++;
        System.out.println(y);
        System.out.println(x);
        int z = ++x;
        System.out.println(z);
    }
}
