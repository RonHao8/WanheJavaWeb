package com.wanhe.homeworkday04;

import java.util.Scanner;

//4.键盘录入行数和列数，输出对应的星形
public class Test24 {
    public static void main(String[] args) {

        print();
    }

    public static void print(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行");
        int n = sc.nextInt();
        System.out.println("请输入列");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
