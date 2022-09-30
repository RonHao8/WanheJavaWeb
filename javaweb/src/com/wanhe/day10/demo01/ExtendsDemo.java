package com.wanhe.day10.demo01;

/*
如果父类没有无参构造方法，那么子类的构造方法会编译错误，如何解决？
    A.在父类加一个无参构造方法
    B.通过使用super关键字去调用父类其他的带参构造方法
    C.子类通过this调用本类的构造方法
 */
class Father{
//    public Father(){
//        System.out.println("Father的无参构造方法");
//    }

    public Father(String name){
        System.out.println("father的带参构造方法");
    }
}

class Son extends Father{
    public Son(){
        //super();
        super("张三");
    }

    public Son(String name){
        //this();//this和super都要放在第一行，冲突了
        super(name);
    }
}
public class ExtendsDemo {
    public static void main(String[] args) {

    }
}
