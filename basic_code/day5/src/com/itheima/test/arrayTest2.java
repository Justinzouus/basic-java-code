package com.itheima.test;

import java.util.Random;

public class arrayTest2 {
    public static void main(String[] args) {
        //1. assign a new array with length 10
        int[] array = new int[10];

        //2. generate 10 random numbers and put it into the array with a loop
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }

        //3. compute the sum of the array
        //4. count how many numbers are greater than the average
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("\n" + "sum:" + sum);
        double average = (double) sum /10;
        System.out.println("average:" + average);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                count++;
            }
        }
        System.out.println("count:" + count);

    }
}

