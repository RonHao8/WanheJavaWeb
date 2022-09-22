package com.wanhe.day04;

/*
数组：数组就是用来存储一批同种类型数据的内存区域（容器）
数组定义的格式：
    数组类型[]  变量名;
    int[] arr;
    double[] arr;
    char[] arr;

    数据类型  变量名[];
    int arr[];
    double arr[];
    char arr[];

  数组初始化方式：
        动态初始化：就是在初始化时给定数组的长度，由系统给出初始化的默认值
        格式：数据类型[] 数组名 = new 数据类型[数据的长度];
 */

public class ArrayDemo {
    public static void main(String[] args) {
        //1班三位同学的分数
        int classScore1 = 100;
        int classScore2 = 80;
        int classScore3 = 98;

        int[] arr = new int[3];//定义一个int类型的数据，数组名为arr

        /*
        [I@1b6d3586
        [ :当前的空间是一个数组类型
        I :当前数组容器中所有存储的数据类型
        @ :分隔符
        1b6d3586 :地址值，十六进制的内存地址
         */
        System.out.println(arr);//[I@1b6d3586

        int[] arr1 = new int[3];
        System.out.println(arr1);//[I@4554617c

        byte[] arr2 = new byte[3];
        System.out.println(arr2);//[B@74a14482



    }
}
