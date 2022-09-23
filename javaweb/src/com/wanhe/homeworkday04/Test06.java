package com.wanhe.homeworkday04;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[arr.length + 1];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数数字: ");
        int num = sc.nextInt();
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= num){
                brr[i] = arr[i];
                index = i + 1;
            }else {
                brr[i + 1] = arr[i];
            }
            brr[index] = num;
        }

        System.out.print("生成的新数组是：");
        for (int i = 0; i < brr.length; i++){
            System.out.print(brr[i] + " ");
        }
    }
}
