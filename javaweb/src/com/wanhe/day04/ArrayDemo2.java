package com.wanhe.day04;

/*
数组的访问
    通过索引访问
        索引：
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        System.out.println(arr);
        System.out.println(arr[0]);//0  系统自动分配的默认初始化值
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int a = 12;
        a *= 2 + 3;
        System.out.println(a);

        int x=4;
        System.out.println("value is "+ ((x>4) ? 99.9 : 9));


    }
}
