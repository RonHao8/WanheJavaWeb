package com.wanhe.day08.demo3;

/*
构造方法注意事项：
    A.如果我们没有给出构造方法，系统会默认给出一个无参构造方法
    B.如果我们给出了构造方法，系统将不再给出默认方法[
 */
public class Student {
    private String name;
    private int age;

    /*
    方法名和类名相同
    没有返回值类型，连void都没有
    构造方法可以重载的
    作用：给对象的数据进行初始化（给成员变量赋值）

    给私有成员变量赋值方式：
        setXxx()和构造方法
     */
    public Student(){
        //System.out.println("调用了构造方法");
        this.name = "张三";
        this.age = 25;
    }

    public Student(String name,int age){
        //System.out.println("调用了构造方法");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name + "," + this.age);
    }
}
