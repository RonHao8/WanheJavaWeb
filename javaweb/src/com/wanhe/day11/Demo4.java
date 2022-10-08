package com.wanhe.day11;

public class Demo4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.drink();
        d.eat();

        Cat c = new Cat();
        c.drink();
        c.eat();

        //Animal a = new Animal();//Animal是抽象类，无法实例化
    }
}
