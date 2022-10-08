package com.wanhe.day11.demo05;

/*
静态代码块：
    位置：类中方法外定义
    特点：需要通过static关键字修饰，随着类的加载而加载，并且只执行一次
    作用：在类加载的时候做一些数据的初始化相关的操作
 */
public class Test3 {
    public static void main(String[] args) {
        Person s = new Person();

        Person s1 = new Person(10);
    }
}

class Person{
    //静态代码块
    static {
        System.out.println("静态代码块执行了");
    }

    public Person(){
        System.out.println("Person类的空参构造方法");
    }

    public Person(int a){
        System.out.println("Person类的有参构造方法");
    }
}