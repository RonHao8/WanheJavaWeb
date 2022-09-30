package com.wanhe.day10.demo04;

/*
重写注意事项:
    1.私有的方法不能被重写的（父类私有的成员子类是不能继承的）
    2.访问权限修饰符  public > protected > 默认 > private
    子类方法的访问权限必须大于等于父类方法的访问权限
    3.静态方法是不能被重写的，如果子类也有相同的静态方法，并不是重写的父类的方法
    
 */

import com.wanhe.day10.q.Z;

class Fu{
    private void show(){
        System.out.println("Fu类中show()方法被调用");
    }

    void method(){//默认
        System.out.println("Fu类中method()方法被调用");
    }

    public static void method2(){
        System.out.println("Fu类中method2()方法被调用");
    }
}

class Zi extends Fu{
//    @Override//检测当前的方法，是否是重写方法，起到校验的作用
//    public void show() {
//        System.out.println("Zi类中的show()方法被调用");
//    }


    @Override
    protected void method() {
        System.out.println("Zi类中的method()方法被调用了");
    }

    public static void method2() {
        System.out.println("Zi类中的method2()方法被调用了");
    }
}
public class Test {
    public static void main(String[] args) {
        Fu.method2();
        Zi.method2();
    }
}
