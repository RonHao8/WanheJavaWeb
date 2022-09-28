package com.wanhe.day08;

class Student{
    public void show(){
        System.out.println("学习");
    }
}

class StudentDemo{
    public void method(Student s){
        s.show();
    }
}

/*
匿名对象的应用场景：
    1.调用方法时，仅仅是调用一次的时候，多次调用就不合适
    2.匿名对象可以作为实际参数进行传递
匿名对象的优点：
    匿名对象调用完毕之后就是垃圾，会被垃圾回收器(GC)回收
 */
public class NoNameDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();

        //匿名对象：就是没有名字的对象
        new Student().show();
        new Student().show();

//        StudentDemo sd = new StudentDemo();
////        Student s1 = new Student();
////        sd.method(s1);
//        sd.method(new Student());
        new StudentDemo().method(new Student());//链式编程（匿名对象）
    }
}
