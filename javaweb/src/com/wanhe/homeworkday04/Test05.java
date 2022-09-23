package com.wanhe.homeworkday04;

public class Test05 {
    public static void main(String[] args) {
        int[] score = new int[]{72, 89, 65, 87, 91, 82, 71, 93, 76, 68};

        int sum = 0;
        for (int i = 0; i < score.length; i++){
            sum += score[i];
        }
        double average = sum / score.length;
        System.out.println("average=" + average);
    }
}
