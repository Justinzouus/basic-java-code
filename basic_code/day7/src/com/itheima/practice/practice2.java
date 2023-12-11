package com.itheima.practice;

public class practice2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200 ; i++) {
            boolean flag = findPrime(i);
            if (flag == true) {
                count ++;
                System.out.println("This number " + i + " is a prime number");
            }
        }
        System.out.println(count);
    }

    public static boolean findPrime(int number){
        boolean flag = true;
        for (int i = 2; i*i < number; i++) {
            if (number % i == 0){
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
