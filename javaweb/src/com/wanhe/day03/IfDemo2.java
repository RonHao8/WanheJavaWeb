package com.wanhe.day03;
/*
if(关系表达式){
    语句体1；
}else{
    语句体2;
}
 */
public class IfDemo2 {
    public static void main(String[] args) {
        int num = 9;
        if(num % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }

        int a = 10;
        int b = 20;
//        int max = a > b ? a : b;

        int max;
        if (a > b){
             max = a;
        }else {
            max = b;
        }
        System.out.println(max);
    }
}
