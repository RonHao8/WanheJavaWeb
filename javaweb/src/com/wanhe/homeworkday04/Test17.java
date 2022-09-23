package com.wanhe.homeworkday04;

public class Test17 {
    public static void main(String[] args) {
        double num = 1.3;
        System.out.println(getSiShe(num));
    }

    public static int getSiShe(double num){
        int a = (int)(num * 10) % 10;
        if (a < 4){
            a =  (int)num;
        }else if (a > 5){
            a =  (int)num + 1;
        }
        return a;
    }
}
