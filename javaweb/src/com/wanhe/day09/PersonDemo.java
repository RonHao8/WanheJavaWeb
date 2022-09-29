package com.wanhe.day09;

public class Person1Demo {
    public static void main(String[] args) {
        //创建对象
        Person1 p1 = new Person1("张三",16,"中国");
        System.out.println(p1.toString());

        Person1 p2 = new Person1("李四",22,"中国");
        System.out.println(p2.toString());
    }
}
