package com.wanhe.homeworkday02;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int c = sc.nextInt();

        switch (c){
            case 1:
                System.out.println("控制台输出:" + num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2:
                System.out.println("控制台输出:" + num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 3:
                System.out.println("控制台输出:" + num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case 4:
                System.out.println("控制台输出:" + num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("运算符输入有误");

        }
    }
}
