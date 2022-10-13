package com.wanhe.day13.demo03;

/*
局部内部类：在方法中定义的类
局部内部类：外界是无法 直接使用，需要在方法内部创建对象并使用
局部内部类可以直接访问外部类成员，也可以访问方法内的局部变量
 */
class Outer{
    int num2 = 50;
    public void method(){
        int num = 20;//局部变量
        class Inner{//局部内部类
            public void show(){
                System.out.println("show");
                System.out.println(num);
                System.out.println(num2);
            }
        }

        //只能在方法中创建对象并使用，出了方法的范围，是无法访问的
        Inner i = new Inner();
        i.show();
    }
    //Inner i = new Inner();
}
public class InnerDemo {
    public static void main(String[] args) {
        //Inner i = new Inner();
        Outer o = new Outer();
        o.method();
    }
}
