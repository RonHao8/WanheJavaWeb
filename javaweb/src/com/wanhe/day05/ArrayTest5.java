package com.wanhe.day05;

//4.比较两组数组是否相同（内容和个数完全一样）

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,7};
        int[] brr = new int[]{1,3,5,7};

        if (arr.length != brr.length){
            System.out.println("两个数组不相同");
        }else {
            for (int i = 0; i < arr.length; i++){
                if (arr[i] != brr[i]){
                    System.out.println("两个数组不相同");
                    return;
                }
            }
            System.out.println("两个数组相同");
        }


    }
}
