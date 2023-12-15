package com.itheima.practice.test;

import com.itheima.practice.object.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student stu1 = new Student(1,"Bob",18);
        Student stu2 = new Student(2,"Anna",20);
        arr[0] = stu1;
        arr[1] = stu2;

        Student stu3 = new Student(3, "Alice", 21);
        boolean flag = contains(arr,stu3.getId());

        if (flag) {
            System.out.println("已存在该学生");
        } else{
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = getNewArr(arr);
                newArr[count] = stu3;
            } else {
                arr[count] = stu3;
            }
        }
    }

    public static Student[] getNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
