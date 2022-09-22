package com.wanhe.homeworkday03;

public class Test18 {
    public static void main(String[] args) {
        int minter = 0;
        int water = 0;
        while (water < 10){
            minter++;
            water += minter - 3;
            if (water < 0){
                water = 0;
            }
        }
        System.out.println("一共使用" + minter + "分钟");
    }
}
