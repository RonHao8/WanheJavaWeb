package com.wanhe.homeworkday04;

import java.util.Scanner;

//5.键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
public class Test25 {
    public static void main(String[] args) {

        print();
    }

    public static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + i * j  + "\t");
            }
            System.out.println();
        }
    }
}
