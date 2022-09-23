package com.wanhe.homeworkday04;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 5, 4};

        int num = 0;

        for (int i = 0; i < arr.length; i++){
            num = num * 10 + arr[i];
        }
        System.out.println("num=" + num);
    }
}
