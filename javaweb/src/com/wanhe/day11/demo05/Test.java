package com.wanhe.day11.demo05;

/*
代码块分类：
    局部代码块：
        位置：方法中定义
        作用：限定变量的生命周期，及早释放内存，提高内存使用率
 */
public class Test {
    public static void main(String[] args) {
        //局部代码块
        {
            int a = 10;
            System.out.println(a);
        }
        //System.out.println(a);
    }
}
