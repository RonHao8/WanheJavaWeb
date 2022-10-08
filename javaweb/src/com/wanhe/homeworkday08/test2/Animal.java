package com.wanhe.homeworkday08.test2;

public class Animal {
    private int age;

    public void move(){
        System.out.println("动物会动");
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
