package com.wanhe.day12.demo05;

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
public class Test {
    public static void main(String[] args) {
//        useDog(new Dog());
//        useCat(new Cat());
        useAnimal(new Dog());
        useAnimal(new Cat());
    }
    //好处：定义方法的时候，使用父类型作为参数，该方法就可以接受这个父类的任意子类对象

    public static void useAnimal(Animal a){//Animal a = new Cat() Animal a = new Dog()
        a.eat();
    }

//    public static void useDog(Dog dog){
//        dog.eat();
//    }
//
//    public static void useCat(Cat cat){
//        cat.eat();
//    }
}
