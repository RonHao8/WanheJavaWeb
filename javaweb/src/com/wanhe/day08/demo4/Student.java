package com.wanhe.day08.demo4;

/*
标准javabean
    1.成员变量  使用private
    2.构造方法  提供一个无参构造，提供一个带有多个参数的构造方法
    3.成员方法  对每一个成员变量提供对应的setXxx()和getXxx()
 */
public class Student {
    private String name;
    private int age;

    //alt + insert


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
