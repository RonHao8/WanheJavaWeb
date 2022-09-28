package com.wanhe.day08.demo3;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("张三",25);
        s.show();

        System.out.println("===============");
        Student s2 = new Student("李四",26);
        s2.show();

        System.out.println("===============");
        Student s3 = new Student();
        s3.show();
    }
}
