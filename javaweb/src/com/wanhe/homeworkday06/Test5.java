package com.wanhe.homeworkday06;

//需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
//
//      选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        average();
    }

    public static void average(){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < arr.length;i++){
            System.out.println("第"+(i+1)+"位评委打分");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[arr.length - 1];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }

        int average = (sum - max - min) / (arr.length - 2);
        System.out.println("平均分为:"+average);
    }
}
