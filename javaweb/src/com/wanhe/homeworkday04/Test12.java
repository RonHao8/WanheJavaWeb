package com.wanhe.homeworkday04;

public class Test12 {
    public static void main(String[] args) {
       int max =  getMax(5,1,7);
        System.out.println("max=" + max);

    }

    public static int getMax(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
}
