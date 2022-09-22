package com.wanhe.day04;

/*
初始化语句;
do {
	循环体语句;
	条件控制语句;
}while(条件判断语句);
 */

public class DoWhileDemo {
    public static void main(String[] args) {
        //while循环
        int x = 0;
        while (x < 10) {
            System.out.println("hello world");
            x++;
        }

        System.out.println("=================");

        int y = 0;
        do {
            System.out.println("hello world");
            y++;
        }while (y < 10);

        System.out.println("==================");

        //while循环先判断后执行
        int x1 = 3;
        while (x1 < 3){
            System.out.println("java web");
            x1++;
        }

        System.out.println("==================");

        //do...while先执行后判断
        //do..while循环至少执行一次循环体，原因是do...while循环是从上到下一次执行的
        int y1 = 3;
        do {
            System.out.println("java web");
            y1++;
        }while (y1 < 3);
    }
}
