package com.wanhe.day13.demo01;

import com.sun.org.apache.bcel.internal.generic.NEW;

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome(){
        System.out.println("看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
public class PolymorpicDemo {
    public static void main(String[] args) {
        userAnimal(new Cat());
        userAnimal(new Dog());
    }

    public static void userAnimal(Animal a){//Animal a = new Cat();  Animal a = new Dog();
        a.eat();
        //Animal A = new Dog();
        //a.watchHome();
//        Dog dog = (Dog)a;//ClassCastException类型转换异常
//        dog.watchHome();

        //判断a变量记录的类型，是否是Dog
        //instanceof：判断关键字左边的变量，是否是右边的类型，返回的是boolean类型结果
        if (a instanceof Dog){
            Dog dog = (Dog)a;
            dog.watchHome();
        }

    }
}
