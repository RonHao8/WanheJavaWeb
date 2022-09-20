package com.wanhe.homeworkday1;

public class Test05 {
    public static void main(String[] args) {
        // 片段1
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }

// 片段2
        {
            int b = 20;
            System.out.println(b);
        }
        //b = 30;
        int b = 30;
        System.out.println(b);
    }
}
