package com.itheima.practice.test;

import com.itheima.practice.object.Car;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"台车的品牌：");
            String brand = sc.next();
            System.out.println("请输入第"+(i+1)+"台车的价格：");
            int price = sc.nextInt();
            System.out.println("请输入第"+(i+1)+"台车的颜色：");
            String color = sc.next();
            Car car = new Car(brand, price, color);
            arr[i] = car;
        }

        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            System.out.println(c.getBrand() + " " + c.getPrice() + " " + c.getColor());
        }
    }
}
