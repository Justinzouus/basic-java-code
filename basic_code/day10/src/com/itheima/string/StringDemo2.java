package com.itheima.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse(str));

    }
    public static String reverse(String str){
        char[] chs = new char[str.length()];
        for (int i = 0; i < chs.length; i++) {
            chs[i] = str.charAt(i);
        }
        String result = "";
        for (int i = 0; i < chs.length; i++) {
            result = result + chs[chs.length - i - 1];
        }
        return result;
    }
}
