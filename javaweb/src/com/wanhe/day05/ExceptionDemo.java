package com.wanhe.day05;

/*
ArrayIndexOutOfBoundsException:索引越界,访问了数组中不存在的索引，造成索引越界问题

NullPointerException:空指针异常，数组已经不再指向堆内存了，而你还用数组名去访问元素
 */

public class ExceptionDemo {
    public static void main(String[] args) {
//        int[] arr = new int[3];
//        System.out.println(arr[3]);

        int[] arr = new int[3];
        arr = null;//空值，引用数据类型的默认值，表示不指向任何有效对象

        System.out.println(arr[0]);

    }
}
