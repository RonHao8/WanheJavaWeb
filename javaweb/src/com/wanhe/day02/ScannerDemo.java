package com.wanhe.day02;

/*
步骤：
    1.导包
        格式：import java.util.Scanner;
        位置：在class上面
    2.创建键盘录入对象
        格式：Scanner sc = new Scanner(System.in);
    3.通过对象获取数据


    需求：
        用户输入两个数据，将数据进行求和并输出到控制台

*/
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数据：");
        //获取用户输入的数据
        int number = sc.nextInt();

        //输出用户输入的数据
        System.out.println("你输入的数据是：" + number);
    }
}
