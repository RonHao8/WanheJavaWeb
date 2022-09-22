package com.wanhe.day04;

/*
求水仙花数
 */

public class ForTest {
    public static void main(String[] args) {
        int ge = 0 ;
        int shi = 0;
        int bai = 0;
        int count = 0;
        for (int j = 100; j <= 999; j++){
            ge = j % 10;
            shi = j / 10 % 10;
            bai = j /100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == j){
                System.out.print("水仙花数:" + j + " ");
                count++;
                if (count % 2 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("水仙花数共有:" + count);

        //求阶乘
        //5！= 1*2*3*4*5
        //n! = n*(n-1)*(n-2)*...*3*2*1

        int jc = 1;
        for (int x = 2; x <= 5; x++){
            jc *= x;
        }
        System.out.println("5的阶乘是：" + jc);

        int ge1,shi1,bai1,qian1,wan1;
        for (int y = 10000; y <= 999999; y++){
            ge1 = y % 10;
            shi1 = y / 10 % 10;
            bai1 = y / 100 % 10;
            qian1 = y / 1000 %10;
            wan1 = y /10000;
            if (ge1 == wan1 && shi1 == qian1 && ge1 + shi1 + qian1 + wan1 == bai1){
                System.out.println(y);

            }
        }

    }
}
