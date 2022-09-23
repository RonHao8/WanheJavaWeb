package com.wanhe.homeworkday04;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9之间的整数：");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
