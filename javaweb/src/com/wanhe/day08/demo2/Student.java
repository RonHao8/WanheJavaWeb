package com.wanhe.day08.demo2;

public class Student {
    private String name;
    private int age;

    //this修饰的变量用于指代成员变量，主要作用是区分局部变量和成员变量重名的问题
    //不带this修饰的变量指的是形式参数，而带this的变量指的是成员变量
    public void setName(String name){
        this.name = name;
        //this代表当前调用方法的引用，哪个对象调用该方法，this就代表哪个一个对象
        System.out.println(this);//com.wanhe.day08.demo2.Student@1b6d3586
    }

    public String getName(){
        //this.setName("李四");
        return name;
    }
}
