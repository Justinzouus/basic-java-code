package com.itheima.practice;

public class practice1 {
    public static void main(String[] args) {
        System.out.println(ticketPrice(3002.1,10,true));
    }
    public static double ticketPrice(double price, int month, boolean cabin){
        double result = price;
        if (month >= 5 && month <=10){
            if (cabin == true) {
                result = price *0.9;
                return result;
            }
            else {
                result = price * 0.85;
                return result;
            }
        }
        else {
            if (cabin == true) {
                result = price *0.7;
                return result;
            }
            else {
                result = price * 0.65;
                return result;
            }
        }
    }
}
