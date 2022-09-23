package com.wanhe.homeworkday04;

import java.util.Scanner;

//2.键盘录入两个数据，比较两个数是否相等
public class Test22 {
    public static void main(String[] args) {

        compare();
    }

    public static void compare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();

        if (a == b){
            System.out.println("两个数相等");
        } else {
            System.out.println("两个数不相等");
        }
    }
}
