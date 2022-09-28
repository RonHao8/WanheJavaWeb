package com.wanhe.day08.demo2;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);//com.wanhe.day08.demo2.Student@1b6d3586
        s.setName("张三");

        System.out.println(s.getName());
    }
}
