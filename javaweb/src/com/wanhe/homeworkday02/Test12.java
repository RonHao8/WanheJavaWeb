package com.wanhe.homeworkday02;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入第一个数");
        int su1 = sc.nextInt();
        System.out.println("输入第二个数");
        int su2 =sc.nextInt();
        System.out.println("输入第三个数");
        int su3 =sc.nextInt();
        int min=su1;
        if(su1>su2){
            min=su2;
        }
        if(su3<min){
            min =su3;
        }
        System.out.println(min);
    }

}
