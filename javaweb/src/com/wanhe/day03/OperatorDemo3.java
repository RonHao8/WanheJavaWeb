package com.wanhe.day03;

public class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a < b);
        System.out.println(a > b);

        boolean flag = a > b;
        System.out.println(flag);

        //boolean flag1 = (a = b);//int --> boolean
        boolean flag1 = (a == b);//int --> boolean
    }
}
