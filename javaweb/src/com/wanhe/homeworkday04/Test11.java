package com.wanhe.homeworkday04;

public class Test11 {
    public static void main(String[] args) {
       double min = getMin(8.8,5.6);
        System.out.println("min=" + min);
    }

    public static double getMin(double a, double b){
        if (a > b){
            return b;
        }
        return a;
    }
}
