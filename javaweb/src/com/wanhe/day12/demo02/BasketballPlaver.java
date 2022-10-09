package com.wanhe.day12.demo02;
//定义篮球运动员具体类
public class BasketballPlaver extends Plaver {
    public BasketballPlaver() {
    }

    public BasketballPlaver(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何投篮和运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，和牛奶");
    }
}
