package com.wanhe.day12.demo02;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    //教
    public abstract void teach();
}
