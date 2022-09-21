package com.wanhe.homeworkday02;

public class Test08 {
    public static void main(String[] args) {
        double fatherLength = 177;
        double motherLength = 165;

        double sonLength = (fatherLength + motherLength) * 1.08 / 2;
        double daughterLength = (fatherLength * 0.923 + motherLength) /2;
        System.out.println("儿子身高为：" + sonLength + "厘米");
        System.out.println("女儿身高为：" + daughterLength + "厘米");
    }
}
