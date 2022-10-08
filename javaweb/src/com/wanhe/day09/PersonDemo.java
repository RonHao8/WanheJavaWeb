package com.wanhe.day09;

public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person("张三",16,"中国");
        System.out.println(p1.toString());

        Person p2 = new Person("李四",22,"中国");
        System.out.println(p2.toString());

        Person p3 = new Person("凤姐",22,"中国");
        System.out.println(p3.toString());

        //static修饰的成员变量为静态成员变量，该变量被所有对象所共享，在内存中有且仅有一份
        Person.country = "美国";//静态成员变量可以直接通过类名去访问，不需要单独创建对象
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
