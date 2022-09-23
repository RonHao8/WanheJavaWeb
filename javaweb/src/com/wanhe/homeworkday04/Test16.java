package com.wanhe.homeworkday04;

public class Test16 {
    public static void main(String[] args) {
        double num = -1.8;
        num = getJueDui(num);
        System.out.println(num);
    }

    public static double getJueDui(double num){
        if (num < 0){
            num = -num;
            return num;
        }else {
            return num;
        }
    }
}
