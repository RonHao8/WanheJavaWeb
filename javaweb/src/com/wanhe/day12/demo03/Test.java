package com.wanhe.day12.demo03;

/*
多态：同一个对象（事物），在不同时刻体现出来的状态
水：液态，固体，气体

动物-->猫，狗
猫对象是一只猫，但是同时也是一只动物
Cat c = new Cat();
Animal animal = new Cat();
猫是一个对象
这个对象就有猫的形态，也有动物的形态
一个对象拥有多种形态，这就是对象的多态

多态的前提：
    A.要有继承关系
    B.方法的重写
 */
class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

public class Test {
    public static void main(String[] args) {
        //当前的事物，是一只猫
        Cat c = new Cat();

        //当前的事物，也是一只动物
        //父类的引用，指向子类对象
        Animal a = new Cat();//StudentDao

        Animal b = new Dog();//OtherStudentDao
    }
}
