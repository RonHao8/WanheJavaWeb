package com.wanhe.day10.demo03;

/*
重写：子类中出现和父类中一模一样的方法声明（方法名相同，参数列表和返回值类型相同）

重写和重载的区别？
重写：子类中出现和父类中一模一样的方法声明（方法名相同，参数列表和返回值类型相同）
重载：同一个类中，出现方法名相同，参数列表不同的现象，与返回值无关
 */

class PhoneV1{
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void call(String name,int num){
        System.out.println("给"+name+"打"+num+"电话");
    }

    public void smallBlack(){
        System.out.println("speak english");
    }
}

class PhoneV2 extends PhoneV1{
    public void smallBlack(){
        super.smallBlack();//speak english
        System.out.println("中文");//子类方法特有的内容
        //System.out.println("speak english,中文");
    }
}


public class OverrideDemo {
    public static void main(String[] args) {

    }
}
