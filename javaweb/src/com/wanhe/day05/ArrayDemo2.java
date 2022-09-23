package com.wanhe.day05;

/*
数组静态初始化：
    初始化时，可以指定数组要存储的数据，系统会自动计算出该数组的长度
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[6];//动态初始化  给出数组长度，系统给出默认初始化值

        //完整格式
        //int[] arr1 = new int[]{20,30,40,50};//静态初始化 给出存储的数据，系统会计算出数组的长度

        //简化格式
        int[] arr1 = {20,30,40,50};//编译时自动补全：int[] arr1 = new int[]{20,30,40,50};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

        //注意：不要同时动态初始化和静态初始化
        //int[] arr2 = new int[4]{20,30,40,50};//错误

    }
}
