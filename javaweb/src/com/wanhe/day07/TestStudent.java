package com.wanhe.day07;


public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);//com.wanhe.day07.Student@1b6d3586

        s1.name = "张三";
        s1.age = 23;
        System.out.println(s1.name + ","+s1.age);
        s1.study();

        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 25;
        System.out.println(s2.name + "," + s2.age);
        s2.study();
    }


}
