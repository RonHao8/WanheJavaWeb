package com.wanhe.day11.demo05;

/*
构造代码块：
    位置：类中方法外定义
    特点：每次构造方法执行时，都会执行该代码块中的代码，并且在构造方法之前执行
    作用：将多个构造方法中相同的代码，抽取到构造代码块中，提高代码的复用性
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student{
    //构造代码块
    {
        int a = 10;
        System.out.println("我是构造代码块");
    }

    public Student(){
        //int a = 10;
        System.out.println("空构造方法");
    }

    public Student(int b){
        //int a = 10;
    }
}