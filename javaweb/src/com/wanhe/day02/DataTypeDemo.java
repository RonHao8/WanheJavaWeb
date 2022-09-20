package com.wanhe.day02;

/*
* 数据类型：Java是一种强类型语言，针对每一种数据都定义了明确的数据类型
* 分类：
*   基本数据类型（4类8门）
*       A.整数        占用字节
*         byte          1
*         short         2
*         int           4
*         long          8
*       B.浮点数
*           float       4
*           double      8
*       C.字符
*           char        2   'a' 'b' 0-65535     A 65    a 97    0 48
*           ASCII码表
*       D.布尔
*           boolean     1
*
*   引用数据类型（类，接口，数组，集合）
*/
public class DataTypeDemo {
    public static void main(String[] args) {
        //定义字节变量
        byte b = 10;
        System.out.println(b);
        //定义一个短整型变量
        short s = 100;
        System.out.println(s);
        //定义一个整型变量
        int i = 1000;
        System.out.println(i);

//        int j = 10000000000;
        //随便写一个整数默认是int类型，10000000000虽然没有超过long的范围，但是它超过了int类型的范围
        long l = 10000000000L;
        System.out.println(l);

        float f = 12.345F;//double   8-->float   4
        System.out.println(f);

        //定义字符变量
        char ch = 'a';
        System.out.println(ch);

        //定义布尔变量
        boolean flag = true;
        System.out.println(flag);

        System.out.println("-----------引用类型------------");
        String name = "张三";//String是表示字符串类型，引用类型
        name = null;
        System.out.println(name);
    }
}
