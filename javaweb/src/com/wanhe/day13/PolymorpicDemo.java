package com.wanhe.day13;

class Fu{
    public int age = 40;
    public void show(){
        System.out.println("Fu show");
    }
}

class Zi extends Fu{
    public int age = 50;

    @Override
    public void show() {
        System.out.println("Zi show");
    }

    public void method(){
        System.out.println("子类特有的方法，method");
    }
}

/*
想要使用子类特有的方法，怎么办？
    A.创建子类对象调用方法   Zi z = new Zi();
    B.把父类的引用强制转换为子类的引用（向下转型，大-->小）

    向上转型：从子到父   父类的引用指向子类对象就是向上转型  Fu f = new Zi();
    向下转型：从父到子   父类的引用转为子类对象
        格式：子类型 对象名 = （子类型）父类引用
 */
public class PolymorpicDemo {
    public static void main(String[] args) {
        //父类的引用指向子类对象
        Fu f = new Zi();//多态
        System.out.println(f.age);
        f.show();

        //多态的弊端，不能调用子类特有的成员
        //f.method();

        //向下转型：从父类类型转换为子类类型
        //f --> Fu --> Zi
        Zi zi = (Zi)f;//f是Fu类型，属于大的类型，大的类型给晓得类型赋值，不能直接直接赋值
        zi.method();

        long l = 5000L;
        int i = (int)l;

        Zi z = new Zi();//不是多态
        z.method();
    }
}
