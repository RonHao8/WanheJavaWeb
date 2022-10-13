package com.wanhe.day13.demo02;

/*
内部类的访问特点
    内部类可以直接访问外部类的成员，包括私有
    外部类要访问内部类的成员，必须创建对象
 */
class Outer{
    private static int a = 10;
    int b = 20;
//    public class Inner{//成员内部类  类中方法外，和成员方法成员变量一个位置
//        int num = 10;
//        public void show(){
//            //内部类，访问外部成员，可以直接访问,包括私有
//            System.out.println(a);//直接访问
//            System.out.println(num);
//        }
//    }

    static class Inner{//成员内部类  类中方法外，和成员方法成员变量一个位置
        static int num = 10;
        //内部类，访问外部成员，可以直接访问,包括私有
        public static void show(){
            System.out.println(a);//直接访问
            System.out.println(num);
        }
    }

    public void method(){//公共方法
        //show();
        //外部类要访问内部类的成员，必须创建对象
        Inner i = new Inner();
        i.show();
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        //访问Inner类的show方法
        //Inner i = new Inner();//编译错误
        //外界创建内部类对象
        //外部类名.外部类名 对象名 = new 外部类对象().new 内部类对象();
//        Outer.Inner i = new Outer().new Inner();
//        System.out.println(i.num);
//        i.show();

//        Outer outer = new Outer();
//        outer.method();

        //Outer.Inner.show();

        //外部类名.内部类名 对象名 = new 外部类名.内部类名();
        Outer.Inner oi = new Outer.Inner();
        oi.show();//静态内部类访问非静态方法
    }
}
