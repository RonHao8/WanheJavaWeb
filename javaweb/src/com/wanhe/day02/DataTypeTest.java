package com.wanhe.day02;

/*
    面试题：
        byte b1 = 3,b2 = 4,b;
        b = b1 + b2;
        b = 3+ 4;

        哪句编译失败？为什么？
            b = (byte)(b1 + b2);
        常量相加和变量相加的区别？
            变量相加：首先会看类型问题（类型统一），最终把结果赋值的时候也会考虑数据类型的问题
            常量相加：会首先做加法运算，然后看结果是否在赋值的数据类型的范围内，
            如果在如果在范围内就成功赋值，不在范围内才会出错
*/
public class DataTypeTest {

}