package com.wanhe.day03;

public class OperatorDemo6 {
    public static void main(String[] args) {
        double score = 55;
        String rs = score >=60 ? "考试通过":"挂科";
        System.out.println(rs);

//        int a = 10;
//        int b = 20;
//        int max = a> b ? a:b;
//        System.out.println(max);

        int a = 150;
        int b = 210;
        int c = 165;
//        int temp = a > b ? a:b;
//        System.out.println(temp);
//        int max = temp > c ? temp:c;
//        System.out.println(max);

        //一步搞定
        int max = (a > b) ? ((a > c)?a:c):((b>c?b:c));
        System.out.println(max);

//        System.out.println(10 > 3 || );
    }
}
