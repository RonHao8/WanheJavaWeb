package com.wanhe.homeworkday06;
//需求：打印三角形(行数可以键盘录入)
//	1
//	1 1
//	1 2 1
//	1 3 3 1
//	1 4 6 4 1
//	1 5 10 10 5 1

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
