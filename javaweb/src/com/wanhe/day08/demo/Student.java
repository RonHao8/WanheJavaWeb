package com.wanhe.day08.demo;

public class Student {
    //姓名
    String name;
    //年龄
    private int age;

    public void show(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
    }

    //给成员变量age赋值
    public void setAge(int a){
        if (a < 0 || a > 120){
            System.out.println("年龄数据有问题");
        }else {
            age = a;
        }
    }

    //获取age值
    public int getAge(){
        return age;
    }
}
