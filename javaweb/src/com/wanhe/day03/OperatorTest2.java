package com.wanhe.day03;

/*
面试题：
    short s = 1;
    s = s + 1;

    short s1 = 1;

    扩展赋值运算符其实是隐含了一个强制类型转换
    s1 += 1;//不是等价于s1 = s1 + 1;而是等价于s1 = (short)(s1 + 1)

    哪一行代码是错误的，指出并改正
*/

public class OperatorTest2 {
    public static void main(String[] args) {
        short s = 1;
        //s = s + 1;
        s = (short)(s +  1) ;

        short s1 = 1;
        s1 += 1;
    }
}
