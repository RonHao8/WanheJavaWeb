package com.wanhe.day11.demo06;

import java.util.ArrayList;

/*
集合和数组：
    相同点：都是容器，可以存储多个数据
    不同点：
        数组的长度是不可变的，集合长度是可变的
        数组可以存储基本数据类型和引用类型，而集合可以存储不同类型的元素
        集合只能存储引用类型（基本类型需要进行装箱 int-->Integer(引用类型，装箱)）

List集合
    实现类：ArrayList
    有序集合，有序指的是存取的顺序

    用户可以精确控制列表中每个元素的插入的位置，用户可以通过整数索引访问元素，也可以插入元素
    可以存储重复的元素
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合容器对象
        //<String>:范型，指定容器中的数据的类型
        ArrayList<String> list = new ArrayList();

        //存储元素 add()
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("javaee");
        list.add("javaee");
        //list.add(20);


        System.out.println(list);//list是引用类型，应该输出地址值,自动调用toString方法

    }
}
