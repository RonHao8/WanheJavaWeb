package com.wanhe.day12.demo02;
//运动员抽象类
public abstract class Plaver extends Person{
    public Plaver() {
    }

    public Plaver(String name, int age) {
        super(name, age);
    }

    //学习
    public abstract void study();
}
