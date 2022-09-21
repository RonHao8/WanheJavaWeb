package com.wanhe.day03;


/*
第一题：
    int a = 10;
    int b = 10;
    int c = 10;

    a = b++;//a=10;b=11
    c = --a;//c=9;a=9
    b = ++a;//b=10;a=10
    a = c--;//a=9;c=8
    分别计算出a,b,c的值
    a=9;b=10;c=8

第二题：
    int x = 10;
    int y = x++ + x++ + x++;
       //y=33     10  + 11  + 12
           // 11   + 12
    计算y的值

第三题：
int x = 4;
int y = (x++) + (++x) + (x*10);
        5   +
分别计算x,y的值
*/
public class OperatorTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;

        a = b++;//a=10;b=11
        c = --a;//c=9;a=9
        b = ++a;//b=10;a=10
        a = c--;//a=9;c=8
        System.out.println(a);//9
        System.out.println(b);//10
        System.out.println(c);//8


//        int x = 10;
//        int y = x++ + x++ + x++;
//        //y=33     10  + 11  + 12
//        //++       11   + 12
//        System.out.println(y);

        int x = 4;
        int y = (x++) + (++x) + (x*10);
        //y=70   4    +  6     +   60
        //++     5      6
        System.out.println(y);
    }
}
