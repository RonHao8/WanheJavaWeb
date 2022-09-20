package com.wanhe.day02;

/*
类型转换：
    强制类型转换：把一个表示数据范围大的数值或者变量赋值给另一个表示数据范围小的变量
    强制类型转换可能会造成数据丢失
    格式：目标数据类型  变量 = （目标数据类型）（被转换的数据）
*/
public class DataTypeDemo3 {
    public static void main(String[] args) {
        /*
            a   00000000  00000000  00000000  00010100    20
            b   00010100
        */
        int a = 20;
        byte b = (byte) a;//int 4 -->byte 1

        byte by = 3;

        byte c = (byte) (a + by);//int-->byte
        System.out.println(c);
    }
}
