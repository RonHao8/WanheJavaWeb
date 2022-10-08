package com.wanhe.day11.demo06;

import java.util.ArrayList;

/*
ArrayList集合相关方法：
    void add(E element) 添加元素
    void add(int index,E element) 在指定位置添加指定元素
    Object get(int index) 获取指定位置的元素
    Object remove(int index) 根据索引删除元素,返回的是被删除的元素
    Object set(int index,Object element) 根据索引修改元素，返回被修改的元素
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        //存储元素 add()
        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println(list);
        list.add(1,"android");
        System.out.println(list);

        //Object get(int index) 获取指定位置的元素
        System.out.println("get:" + list.get(1));

        //Object remove(int index) 根据索引删除元素,返回的是被删除的元素
        System.out.println("remove:" + list.remove(1));

        //Object set(int index,Object element) 根据索引修改元素，返回被修改的元
        //[hello, world, java]
        System.out.println("set:" + list.set(1,"javaee"));//world

        System.out.println(list);
    }
}
