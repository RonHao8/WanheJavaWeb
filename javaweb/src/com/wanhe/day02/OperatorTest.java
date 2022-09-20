package com.wanhe.day02;

/*
键盘录入一个三位数，将三位数进行拆分，
个位，十位，百位，分别打印在控制台

123
整数123个位为:3
整数123个位为:2
整数123个位为:1

分析：
    1.使用Scanner键盘录入一个三位数
    2.个位的计算：数值 % 10  123/10=12  余数3
    3.十位的计算：数值/10 % 10  余数2
    4.百位的计算：数值/100

*/

import java.util.Scanner;

public class OperatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数：");
        int num =sc.nextInt();
        System.out.println("这个三位数的个位是：" + num%10);
        System.out.println("这个三位数的十位是：" + num/10%10);
        System.out.println("这个三位数的百位是：" + num/100);

    }
}
