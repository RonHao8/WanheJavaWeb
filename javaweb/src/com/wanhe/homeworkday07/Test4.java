package com.wanhe.homeworkday07;

public class Test4 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setColor("花色");
        c.setBreed("波斯猫");
        c.eat();
        c.catchMouse();


        Dog d = new Dog();
        d.setColor("黑色");
        d.setBreed("藏獒");
        d.eat();
        d.lookhome();
    }
}
