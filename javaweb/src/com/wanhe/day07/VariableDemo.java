package com.wanhe.day07;

/*
面试题：
成员变量和局部变量的区别？
1.位置不同：
    成员变量：类中方法外
    局部变量：方法声明上（形式参数）或者方法内部
2.内存中的位置不同：
    成员变量：堆内存
    局部变量：栈内存
3.生命周期不同：
    成员变量：随着对象的存在而存在，随着对象的消失而消失
    局部变量：随着方法的调用而存在，随着方法的调用完毕而消失（方法弹栈）
4.初始化值不同：
    成员变量：有默认初始化值
    局部变量：没有默认初始化值，必须要先定义，再赋值才能使用
 */

public class VariableDemo {
    String name;

    public void study(String name){
        int i = 0;
        System.out.println(name);
    }

    public void doHomeWork(){
        System.out.println("多做练习");
        int j = 0;
    }

    int age;
}


