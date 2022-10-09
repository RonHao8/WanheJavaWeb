package com.wanhe.day12.demo04;

/*
多态中成员的访问特点(重要)：
    构造方法
        创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
    成员变量
        编译看左边（父类），运行看左边（父类）
    成员方法
        编译看左边（父类），运行看右边（子类）
    静态方法
        编译看左边，运行看右边
 */
class Fu{
    public int num = 100;
    public void show(){
        System.out.println("show Fu");
    }

    public static void function(){
        System.out.println("function Fu");
    }
}
class Zi extends Fu{
    public int num = 1000;
    public void show(){
        System.out.println("show Zi");
    }

    public static void function(){
        System.out.println("function Zi");
    }
}
public class DuoTaiDemo {
    public static void main(String[] args) {
        //父类的引用指向子类对象
        Fu f = new Zi();//多态
        System.out.println(f.num);

        f.show();
        f.function();
    }
}
