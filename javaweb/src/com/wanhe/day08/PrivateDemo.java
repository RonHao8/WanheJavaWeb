package com.wanhe.day08;

/*
private:是一个权限修饰符，可以修饰成员变量和成员方法，被修饰的成员只能在本类中使用

应用：
    把成员变量用private修饰符
    提供对应的getXxx()/setXxx()方法（公共方法）
 */

class Demo{
    private int num = 10;

    public void show(){
        System.out.println(num);
    }

    private void method(){
        System.out.println("method方法");
    }

    public void function(){
        method();
        show();
    }
}
public class PrivateDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        //d.method();//在其他类中不能访问私有的成员方法
        d.show();
        d.function();
        //System.out.println(d.num);//在其他类中不能访问私有成员变量
    }
}
