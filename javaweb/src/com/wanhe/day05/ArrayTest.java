package com.wanhe.day05;

/*
获取数组中最大值
 */

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {12,45,98,73,60};

        //假设数组中的第一个元素是最大值
        int max = arr[0];
        //遍历数组，获取每一个元素，准备进行比较
        for (int i = 1; i < arr.length; i++){//arr,for
            if (max < arr[i]) {
                //如果在比较的过程中，出现了比max更大的值，让max记录这个更大的值
                    max = arr[i];
            }
        }
        System.out.println("max:"+ max);
    }
}
