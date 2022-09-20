package com.wanhe.day02;
/*
    常量:在程序执行的过程中其值不发生改变的量，例如圆周率
    常量分类：
        字面值常量
            整数常量
            小数常量
            字符串常量
            字符常量
            布尔常量
            空常量:null,空值，数组会讲解
        自定义常量
            public static final 数据类型 常量名 = 常量值;
*/

public class LiteralDemo {
    //自定义常量,类中方法外
    public static final double PI=3.1415926;
    public static void main(String[] args) {
        System.out.println(123);
        System.out.println(12.56);
        System.out.println("abc");//字符串常量，双引号括起来
        System.out.println('a');//字符常量，单引号括起来，并且只能是一个字符
        System.out.println(true);//不二常量，只有两个值，true,false
        System.out.println(false);
    }
}
