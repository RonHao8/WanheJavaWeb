package com.wanhe.day03;

/*
&& 和 & 的区别？同理 | 与 || 的区别?
    A.最终结果是一样的
    B.&&具有短路效果，符号左边为false的时候，右边就不执行了，
        如果符号左边为true，右边还是要继续执行
       &无论左边真假，右边都要执行, ||与 |同理

    开发过程中建议使用：%%, ||
*/

public class OperatorDemo5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println((a > b) & (a < c));//false & true = false
        System.out.println((a > b) && (a < c));//false && true = false

        System.out.println((a > b) | (a < c));//true
        System.out.println((a > b) || (a < c));//true

        System.out.println("=====================");
        int x = 3;
        int y = 4;
       // boolean b1 = ((++x == 3)) & (y++ == 4);
        boolean b1 = ((++x == 3)) && (y++ == 4);//短路效果

        System.out.println("x:" + x);//x:4
        System.out.println("y:" + y);//y:4
        System.out.println("b1:" + b1);//b1:false
    }
}
