package com.wanhe.day11;

public class Cat extends Animal{
    //子类必须重写抽象类中的抽象方法eat
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
