package com.itheima.string;

public class StringDemo4 {
    public static void main(String[] args) {
        String phone = "13632874591";

        String front = phone.substring(0,3);
        String back = phone.substring(7);

        String result = "";
        result = front + "****" + back;
        System.out.println(result);

    }
}
