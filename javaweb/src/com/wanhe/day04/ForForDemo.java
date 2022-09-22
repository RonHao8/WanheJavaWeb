package com.wanhe.day04;

/*
 *****
 *****
 *****
 *****
 */

public class ForForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){//控制行
            for (int j = 1; j <= 5; j++){//控制列
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //*
        //**
        //***
        //****
        //*****

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();

        //1*1=1
        //2*1=2  2*2=4
        //3*1=3  3*2=6  3*3=9
        //4*1=4  4*2=8  4*3=12  4*4=16

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i *j + "\t");
            }
            System.out.println();

        }
    }
}
