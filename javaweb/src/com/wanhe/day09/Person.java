package com.wanhe.day09;

public class Person1 {
    String name;
    int age;

    String country;

    public Person1() {
    }

    public Person1(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
