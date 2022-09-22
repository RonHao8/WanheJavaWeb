package com.wanhe.day04;

/*
随机数
 */

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 1; i <= 10; i++){
            //随机数的范围是含前不含后
            int num = r.nextInt(10) + 1;//[0,10)  1~10
            System.out.println(num);
        }


    }
}
