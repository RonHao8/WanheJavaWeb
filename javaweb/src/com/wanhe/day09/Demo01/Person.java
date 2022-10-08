package com.wanhe.day09.Demo01;

/*
父类：把多个类中相同的内容提取出来定义到一个类中，这个类称之为父类
 */
public class Person {//Student/Teacher --> Person
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
