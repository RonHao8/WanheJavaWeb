package com.wanhe.day11.demo06;

import java.util.ArrayList;
import java.util.Iterator;

/*
集合的遍历：
    1.迭代器
    2.增强for循环
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        //存储元素 add()
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("javaee");
        list.add("javaee");

        //迭代器遍历集合
        //1.获取迭代器对象  2.使用迭代器中相关的方法进行遍历
       Iterator<String> it = list.iterator();

       //hasNext() 判读当前位置是否有数据 返回值是boolean
        // next() 获取数据
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("===================");

        //2.增强for循环-->底层还是使用的是迭代器
        for (String s :list){
            System.out.println(s);
        }
    }
}
