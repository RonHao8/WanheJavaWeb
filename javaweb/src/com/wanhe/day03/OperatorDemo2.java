package com.wanhe.day03;

/*
赋值运算符：
    基本赋值运算符：   =    把=右边的数据赋值给左边
    扩展赋值运算符：+=，-=，*=，/=，%=
        +=：把左边和右边做加法，然后赋值给左边    a += b  -->a = a+b
*/

public class OperatorDemo2 {
    public static void main(String[] args) {
        int x = 10;
        int a,b;
        a = b = 10;
        System.out.println(a + "," + b);

        int y = 10;
        y += 20;//y = y +20;
        System.out.println(y);//30
    }
}
