package com.wanhe.day12;

public class Cat extends Animal implements AnimalTrain{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {//扩展方法,额外功能
        System.out.println("猫可以跳高了");
    }
}
