package com.wanhe.day06;

/*
方法重载：
    同一个类中,方法名相同，参数列表不同，和返回值无关
    参数列表不同：个数不同，类型不同，顺序不同
 */

public class OverrideDemo {
    public static void main(String[] args) {

    }

    //参数个数不同
    public static void method(int a, int b){
        System.out.println(a + b);
    }

    public static void method(int a, int b,int c){
        System.out.println(a - b - c);
    }

    //参数类型不同
    public static void fn(int a){

    }

    public static void fn(double a){

    }

    public static int bn(int a,double b){
        return 0;
    }

    public static double bn(double b,int a){
        return 0.1;
    }


}
