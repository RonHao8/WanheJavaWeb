package com.wanhe.homeworkday06;
//需求：打印三角形(行数可以键盘录入)
//	1
//	1 1
//	1 2 1
//	1 3 3 1
//	1 4 6 4 1
//	1 5 10 10 5 1
/*
步骤：
    1.先定义一个二维数组，行数如果是n，我们把列数也预先定义为n
    这个n的值是来自于键盘录入
    2.给这个二维数组任何一行的第一列和最后一列赋值为1
    3.按照规律给其他元素赋值
        从第三行开始，每一个数据是他上一行的前一列和它上一行本列之和
     4.遍历二维数组
 */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数");
        int n = sc.nextInt();

        //定义二维数组
        int[][] arr = new int[n][n];


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <= i; j++){
                //给这个二维数组任何一行的第一列和最后一列赋值为1
                if (j == 0 || j == i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        //遍历二维数组
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
