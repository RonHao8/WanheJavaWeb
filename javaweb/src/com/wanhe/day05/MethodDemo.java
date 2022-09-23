package com.wanhe.day05;

/*
方法的定义和调用：
无参数方法定义和调用
格式：
    public static void 方法名() {
        方法体;
    }

    public static void eat() {

    }
位置：类中方法外
注意：方法和方法之间是平级关系，不能是嵌套关系
 */
public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        eat();
        //study();//声明的所有方法是不是只能在main方法中调用呢？
    }

    //定义无参方法
    public static void eat() {
        study();
        System.out.println("吃饭");
    }

    public static void study(){
        System.out.println("学习");
    }
}
