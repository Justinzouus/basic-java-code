package com.itheima.practice;

import java.util.Random;

public class practice3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char)(97+i);
            }
            else {
                chs[i] = (char)(39+i);
            }
        }

        String result = "";

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int number = r.nextInt(chs.length);
            result = result + chs[number];
        }

        int number1 = r.nextInt(10);
        result = result + number1;
        System.out.println(result);
    }
}
