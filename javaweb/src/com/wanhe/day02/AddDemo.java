package com.wanhe.day02;

import java.util.Scanner;

//需求：
//        用户输入两个数据，将数据进行求和并输出到控制台
public class AddDemo {
    public static void main(String[] args) {
//        //创建键盘录入对象
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("请输入一个数据：");
//        //获取用户输入的数据
//        int number = sc.nextInt();
//
//        //输出用户输入的数据
//        System.out.println("你输入的数据是：" + number);

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个数据:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = 0;
        sum = num1+num2;
        System.out.println("两个数的和是："+ sum);
    }
}
