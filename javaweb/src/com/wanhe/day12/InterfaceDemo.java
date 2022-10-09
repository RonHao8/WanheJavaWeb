package com.wanhe.day12;

/*
接口的关键字：interface
接口仅仅提供一些基本的功能：
    比如：猴子钻火圈，不是动物本身就具备的
    是后期培养训练出来的，这种额外的功能，Java可以用接口表示

接口的特点：
    A.接口关键字interface表示
        interface 接口名{}
    B.类实现接口用implements表示
        class 类名 implements 接口名{}
    C.接口不能实例化
    D.接口的子类
        1.可以是抽象类
        2.可以是具体的类
 */


//狗类  猫类
public class InterfaceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.jump();

        //AnimalTrain at = new AnimalTrain();无法实例化
    }
}
