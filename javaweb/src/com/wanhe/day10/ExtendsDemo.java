package com.wanhe.day10;

/*
继承中访问变量的特点：

如果父子类中，出现了同名的成员变量，通过就近原则，会优先使用子类的，
如果一定要使用父类的，可以通过super关键字

this:代表本类对象的引用
super:代表父类对象的引用
 */

class Father{
    public int num = 10;
    public int number =20;

    public Father() {
    }

    public Father(int num, int number) {
        this.num = num;
        this.number = number;
    }

    public void show(){
        System.out.println(num + "," + number);
    }
}

class Son extends Father{
    public int num = 20;
    public int num2 = 30;

    //所有的子类中的构造方法默认都会访问父类中的无参构造方法
    public Son(){

    }

    /*
    子类中的构造方法默认都会访问父类中的无参构造方法,为什么
    因为子类会继承父类中的数据，可能会使用父类的数据
    所以，子类初始化前，一定要完成父类的数据的初始化(调用父类的构造方法)。
    注意：子类每一个构造方法的第一行语句默认都是super()
     */

    public Son(int num, int number, int num1, int num2) {
        //super(num, number);
        this.num = num1;
        this.num2 = num2;
    }

    public void print(){
        //int num = 40;
        System.out.println(super.num);//super代表父类对象，可以操作父类的成员
        super.show();//调用父类中的方法
        System.out.println(num2);
        System.out.println(number);
    }
}
public class ExtendsDemo {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
        s.print();
    }
}
