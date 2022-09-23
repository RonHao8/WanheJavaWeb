package com.wanhe.homeworkday04;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入行数：");
        int n = sc.nextInt();
        System.out.println("请输入列数：");
        int m = sc.nextInt();

        print(n,m);
    }

    public static void print(int n, int m){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
