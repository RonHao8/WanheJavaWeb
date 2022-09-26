package com.wanhe.day06;

/*
类：设计图
 */

public class Student {
    //属性：姓名，年龄
    //成员变量：跟之前定义变量的格式一样的，只不过位置发生变化了，类中方法外
    //成员变量一般不指定初始化值，存在默认值
    String name;//null
    int age;//0

    //行为：学习
    //成员方法：跟之前定义方法的格式一样，只不过去掉了static关键字
    public void study(){
        System.out.println("学习");
    }

    //main方法不定义在此类中，原因是main方法不属于对学生类的行为的描述
//    public static void main(String[] args) {
//
//    }
}
