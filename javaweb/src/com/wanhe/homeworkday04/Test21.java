package com.wanhe.homeworkday04;

import java.util.Scanner;

//1.键盘录入两个数据，返回两个数中的较大值
public class Test21 {
    public static void main(String[] args) {
        int max = max();
        System.out.println("max="+max);

    }

    public static int max(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();

        if (a > b){
            return a;
        }else {
            return b;
        }
    }
}
