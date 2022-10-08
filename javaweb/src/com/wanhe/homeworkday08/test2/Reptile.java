package com.wanhe.homeworkday08.test2;

public class Reptile extends Animal{
    @Override
    public void move() {
        System.out.println("爬行动物可以爬");
    }

    public void ectothermic(){
        System.out.println("爬行动物不能体温调节");
    }
}
