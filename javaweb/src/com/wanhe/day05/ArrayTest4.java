package com.wanhe.day05;

//3.将一组数组中的元素进行对调
//如：int[] arr = {12,23,98} 对调后是 int[] arr = {98,23,12}
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {12,23,98};

        for (int i = 0; i < arr.length / 2; i++){
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
