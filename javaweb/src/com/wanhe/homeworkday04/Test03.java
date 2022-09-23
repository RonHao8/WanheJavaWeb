package com.wanhe.homeworkday04;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];

        int sum = 0;
        for (int i = 0; i < 6; i++){
            arr[i]= r.nextInt(100);
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }

}
