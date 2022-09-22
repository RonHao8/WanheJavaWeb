package com.wanhe.day04;

import java.util.Scanner;

/*
格式：
    for(初始化语句;条件判断语句;条件控制语句){
        循环体语句;
    }
    for(int i = 1; i <= 10; i++){
        跑一圈;
    }
 */
public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i<= 10; i++){
            System.out.println("折返跑");
        }

        //1~5之间的值
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("sum:" + sum);

        //求1~100之间的偶数和，将结果在控制台打印
        int sum2 = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum2 += i;
            }
        }
        System.out.println("sum2:" + sum2);




    }
}
