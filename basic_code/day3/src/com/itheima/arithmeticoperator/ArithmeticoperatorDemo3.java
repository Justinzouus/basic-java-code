package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        int a = 10;
        a += 1;
        System.out.println(a);

        //+=，-=，*=，/=，%=底层都隐藏了强制类型转换
        short s = 1;
        s += 1;
        System.out.println(s);
        //等同于 s = (short)(s+1)
    }
}
