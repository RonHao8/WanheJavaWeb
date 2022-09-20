package com.wanhe.day02;

import java.util.Arrays;

public class VariableDemo {
    public static void main(String[] args) {//快捷生成 psvm
        //数据类型 变量名 = 初始化值;
        int age =18;//声明变量并赋值
        System.out.println(age);//快捷键 sout

        //double money =25.5;

        //先声明，后赋值0（使用前赋值即可）
        double money;
        money = 25.5;
        System.out.println(money);

        int a = 10;
        a=30;//变量前面不加数据类型时，表示修改已经存在的变量的值
        System.out.println(a);
    }
}
