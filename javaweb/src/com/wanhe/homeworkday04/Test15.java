package com.wanhe.homeworkday04;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();

        compare(a,b,c);
    }

    public static void compare(int a, int b, int c){
        int max = 0;
        int min = 0;
        int mid = 0;

        if (a > b && a > c){
            max = b;
        }else if (b > c && b > a){
            max = b;
        }else {
            max = c;
        }

        if (a < b && a < c){
            min = a;
        }else if (b < a && b < c){
            min = b;
        }else {
            min = c;
        }

        mid = a + b + c - max - min;

        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);
    }
}
