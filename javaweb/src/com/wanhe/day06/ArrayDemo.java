package com.wanhe.day06;

/*
二维数组：二维数组也是一个容器，该容器用来存储一维数组的
定义格式：
    格式1：数据类型[][] 变量名;
    格式2：数据类型 变量名[][];
    格式3：数据类型[] 变量名[];
 动态初始化：
    数据类型[][] 变量名 = new 数据类型[m][n];
    m:表示这个二维数组，可以存放多少个一维数组
    n:表示每一个一维数组，可以存放多少个元素

 补充：
      数据类型[][] 变量名 = new 数据类型[m][];
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //定义一个二维数组arr,这个二维数组有3个一维数组的元素
        //每一个一维数组有2个元素
        int[][] arr = new int[3][2];
        System.out.println(arr);//[[I@1b6d3586

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        arr[0][0] = 11;
        arr[0][1] = 22;

        arr[1][0] = 11;
        arr[1][1] = 22;

        arr[2][0] = 11;
        arr[2][1] = 22;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println("===================");

        int[][] arr1 = new int[3][];//给出二维数组的长度，一维数组长度动态给出
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        //动态为每一个一维数组分配空间
        arr1[0] = new int[2];
        arr1[1] = new int[3];
        arr1[2] = new int[4];

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
