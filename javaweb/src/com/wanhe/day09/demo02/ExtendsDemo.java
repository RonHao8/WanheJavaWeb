package com.wanhe.day09.demo02;

class Granddad{
    public void drink(){
        System.out.println("爷爷爱喝酒");
    }
}

class Father extends Granddad{
    public void smoke(){
        System.out.println("爸爸爱抽烟");
    }
}

class Son extends Father{//多层继承
    //此时，Son类中就同时有drink和smoke方法
}
public class ExtendsDemo {
    public static void main(String[] args) {
        Son s = new Son();
        s.drink();//使用父亲的
        s.smoke();//使用爷爷的
    }
}
