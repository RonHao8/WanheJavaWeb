package com.wanhe.day02;

/*
类型转换:
    隐式转换：类型范围小的变量，可以直接赋值给类型范围大的变量
    byte,short,char-->int-->long(8)-->float(4)-->double

    long:2^63-1
    float:3.4*10^38

    byte,short,char 相互之间不转换，它们参与运算首先转为int类型进行运算
*/
public class DataTypeDemo2 {
    public static void main(String[] args) {
        byte a = 12;
        int b = 1;
        System.out.println(b);

        byte by = 10;//int
        short s = 20;//int
        int result = by + s;

        byte by1 = 3;//byte-->int
        int c = 5;
        int result1 = by1 + c;

        double a1 = 3.5;
        int b1 = 23;//int-->double 23.0
        double d = a1 +b1;

    }
}
