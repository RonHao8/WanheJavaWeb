package com.wanhe.day02;

/*
使用变量注意事项：
    1.在同一对大括号里面，不能出现重复的变量名
    2.作用域
        变量定义在哪个大括号内，它就在这个大括号内有效
*/

public class VariableDemo2 {
    public static void main(String[] args) {
        //定义变量
        int x =100;
        //double x = 52.5;
        {
            //当代码块的内容执行完毕后，垃圾回收器会将代码快中所有的变量从内存中清理掉
            int number =90;
            System.out.println(number);
        }
        //System.out.println(number);//超出作用域范围
        System.out.println(x);

//        int a = 10;
//        int b = 20;
//        int c = 30;

        int a,b,c;

        int f;int g;
        int h;int i;


    }
}
