package com.wanhe.day11.demo02;

/*
final可以修饰类、方法、变量
特点：
    final可以修饰类，该类就不能被继承
    final可以修饰方法，该方法就不能被重写
    final可以修饰变量，该变量就不能被重新赋值，这个变量就是常量
 */
//final class Fu{}//final可以修饰类，该类就不能被继承
class Fu{
    public final void show(){}//final可以修饰方法，该方法就不能被重写
    public int num = 10;
    public final int MAX_NUM = 20;
}
class Zi extends Fu{
    public void show2(){
        num = 50;
        System.out.println(num);

        //无法为常量再次赋值
        //MAX_NUM = 60;
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show2();
    }
}
