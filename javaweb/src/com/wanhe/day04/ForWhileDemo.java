package com.wanhe.day04;

/*
while和for循环的区别？
使用区别：
    在循环结束后，想继续使用控制条件的那个变量，用while循环，否则使用for循环
    如果是一个范围的，用for循环
    不明确要做多少次，用while循环
 */

public class ForWhileDemo {
    public static void main(String[] args) {
        //for循环
        for (int i = 0; i < 10; i++){
            System.out.println("java与web");
        }

        //代码 i = 10
        //System.out.println(i);

        int y = 0;
        while (y < 10){
            System.out.println("java与web");
            y++;
        }
        System.out.println(y);
    }
}
