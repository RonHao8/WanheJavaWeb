package com.wanhe.day11;

public abstract class Animal {
    public abstract void eat();//抽象方法，子类必须要重写,抽象方法不能有主体的

    public void drink(){
        System.out.println("喝水");
    }
}
