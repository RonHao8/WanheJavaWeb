package com.wanhe.day11.demo03;

class Student{
    int age = 25;
}

/*
面试题：final修饰局部变量的问题
    基本类型：基本类型的值是不能发生改变的
    引用类型：引用类型的地址值不能改变，但是该对象的堆内存的值（成员变量）可以改变
 */
public class FinalTest {
    public static void main(String[] args) {
        //局部变量是基本类型
        int x = 10;
        x = 100;
        System.out.println(x);

        final int y = 10;//常量
        //y = 100;
        System.out.println("===================");

        Student s = new Student();
        System.out.println(s.age);
        s.age = 100;
        System.out.println(s.age);

        final  Student ss = new Student();//地址值不能改变
        System.out.println(ss.age);
        ss.age = 100;

        //ss = new Student();//重新分配内存，地址值发生改变
    }
}
