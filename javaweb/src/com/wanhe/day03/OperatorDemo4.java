package com.wanhe.day03;

/*
逻辑运算符

5 < x < 15

拆解：x > 5 并且 x < 15
java: x > 5 && x < 15

&  逻辑与
|  逻辑或
!  逻辑非      ! true = false
^  逻辑异或

短路效果-->提高代码的执行效率
&& 逻辑与
|| 逻辑或

&: 逻辑与，有false则false,只有符号两边同时为true,结果才会为true
|: 逻辑或，有true则true,只有符号两边同时为false,结果才为为false
^: 逻辑异或,相同为false，不同为true
!: 逻辑非（取反）,特点：偶数个不改变本身
*/
public class OperatorDemo4 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x > 5 & x < 15);//true & true = true

        int i = 10;
        int j = 20;
        int k = 30;

        System.out.println((i > j) & (i > k));//false & false = false
        System.out.println((i < j) & (i > k));//true & false = false
        System.out.println((i > j) & (i < k));//false & true = false
        System.out.println((i < j) & (i < k));//true & true = true

        System.out.println("-------------------------------");
        System.out.println((i > j) | (i > k));//false | false = false
        System.out.println((i < j) | (i > k));//true | false = true
        System.out.println((i > j) | (i < k));//false | true = true
        System.out.println((i < j) | (i < k));//true | true = true

        System.out.println("-------------------------------");
        System.out.println((i > j) ^ (i > k));//false ^ false = false
        System.out.println((i < j) ^ (i > k));//true ^ false = true
        System.out.println((i > j) ^ (i < k));//false ^ true = true
        System.out.println((i < j) ^ (i < k));//true ^ true = false

        System.out.println("-------------------------------");
        System.out.println((i > j));//false
        System.out.println(!(i > j));//true
        System.out.println(!!(i > j));//false
        System.out.println(!!!(i > j));//true
    }
}
