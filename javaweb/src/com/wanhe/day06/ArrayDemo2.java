package com.wanhe.day06;

/*
二维数组静态初始化
    完整格式：数据类型[][] 变量名 = new 数据类型[][] {{元素1，元素2},{元素1，元素2},{元素1，元素2}};
    简化格式：数据类型[][] 变量名 = {{元素1，元素2},{元素1，元素2},{元素1，元素2}};
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5},{6}};
        System.out.println(arr[0][1]);//2
        System.out.println(arr[2][0]);//6

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};
        int[] arr3 = {6};
        int[][] array = {arr1,arr2,arr3};
        System.out.println(array[0][1]);//2
        System.out.println(array[2][0]);//6
    }
}
