package com.wanhe.day13.demo04;
//接口
interface Inter{
    void show();
}

//class InterImpl implements Inter{
//    @Override
//    public void show() {
//        System.out.println("重写show方法");
//    }
//}
public class InnerClass {
    public static void main(String[] args) {
//        InterImpl ii = new InterImpl();
//        ii.show();

        //本质：是一个实现了该接口或者继承了该类的子类的匿名对象
//        new Inter(){//该接口的具体的实现对象
//            @Override
//            public void show() {
//                System.out.println("重写show方法");
//            }
//        }.show();


        Inter i = new Inter(){//匿名内部类可以通过多态的形式接受
            @Override
            public void show() {
                System.out.println("重写show方法");
            }
        };
        i.show();
    }
}
