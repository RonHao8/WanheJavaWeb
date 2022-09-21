package com.wanhe.homeworkday02;

public class Test11 {
    public static void main(String[] args) {
        double newPhone = 7988;
        double oldPhone = 1500;

        double moneyNoUse = newPhone - oldPhone;
        double moneyUse = newPhone * 0.8;

        if (moneyNoUse < moneyUse){
            System.out.println("不使用以旧换新时的花费更少");
        }else {
            System.out.println("使用以旧换新时的花费更少");
        }
    }
}
