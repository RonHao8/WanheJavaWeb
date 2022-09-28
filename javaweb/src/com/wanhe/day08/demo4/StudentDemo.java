package com.wanhe.day08.demo4;

public class StudentDemo {
    public static void main(String[] args) {
        //通过set方法给成员变量进行赋值
        Student s = new Student();
        s.setName("张三");
        s.setAge(25);
        System.out.println(s.toString());

        //通过构造方法给成员变量进行赋值
        Student s2 = new Student("李四",25);
        System.out.println(s2.toString());
    }
}
