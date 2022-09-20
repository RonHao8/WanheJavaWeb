package com.wanhe.day02;

/*
运算符：就是对常量和变量进行操作的符号
int a = 10;
int b = 20;
int c = a + b;

表达式：用运算符把常量或者变量连接起来符合java语法的式子可以称之为表达式
不同的运算符连接的表达式体现的是不同类型的表达式

分类：
    算术运算符，赋值运算符，比较运算符，逻辑运算符，位运算符（后面讲），三目运算符

   算术运算符：
        +, -, *, /, %(取余/取模), ++, --

        + :
            算术运算符
            正数
            字符串的连接符
*/
public class OperatorDemo {
    public static void main(String[] args) {
        //定义变量
        int a = 3;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (b*1.0));//int / int  0  0.75

        //%:取余数
        System.out.println(a % b);// 3 / 4= 0 余数为3

        int c = 1;
        char d = 'a';//97
        System.out.println(c + d);//算术运算符

        System.out.println("itwanhe" + 666);
        System.out.println(1 + 2 + "itwanhe" + 3 + 4);
        System.out.println(1 + 2 + "itwanhe" + 3 + "true");

    }
}
