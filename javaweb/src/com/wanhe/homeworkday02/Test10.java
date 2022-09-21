package com.wanhe.homeworkday02;

public class Test10 {
    public static void main(String[] args) {
        int fish =24;
        int peanuts =8;
        int rice =3;
        int fish1 = 16;
        double price1=(fish+peanuts+rice)*0.8;
        int price2 =fish1 +peanuts+rice;
        double min =price1>price2?price2:price1;
        System.out.println(min);
    }
}
