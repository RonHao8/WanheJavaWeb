package com.wanhe.day11.demo04;

/*
final修饰变量的初始化时机（常量）
    1.在创建的时候直接给值
    2.在构造方法完毕前给值(非静态常量)
 */
class Demo{
//    int num = 10;
//    final int num2 = 20;
    int num;
    final int num2;//非静态常量
    static final int num3 = 50;//静态常量必须在声明是给值

    //构造代码块，在构造方法执行之前执行的代码
    {
        num2 = 20;
    }
    public Demo(){
        num = 10;
        //num2 = 20;
    }
}
public class FinalTest {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.num);
        System.out.println(d.num2);
    }
}
