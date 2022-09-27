package com.wanhe.day07;

class StudentDemo{
    public void method(Student s){//自定义引用类型可以作为形式参数传递
        //改变的是该对象的属性值，并不是地址值
        s.name = "万和开心果";
        s.age = 23;
    }
}
public class TestStudent2 {
    public static void main(String[] args) {
        StudentDemo sd = new StudentDemo();
        Student s = new Student();
        s.name = "张三";
        s.age = 25;
        System.out.println(s.name+","+s.age);

        sd.method(s);//把s的地址值传递到了该方法中
        System.out.println(s.name+","+s.age);
    }
}
