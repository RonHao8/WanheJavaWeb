package com.wanhe.day04;

/*
for(初始化语句;条件判断语句;条件控制语句) {
    循环体语句;
}

while循环：
    初始化语句：
    while(条件判断语句){
        循环体语句;
        条件控制语句;
    }
 */

public class WhileDemo {
    public static void main(String[] args) {
        for (int x = 0; x < 10; x++){
            System.out.println("hello world");
        }

        System.out.println("=================");

        //while循环
        int x = 0;
        while (x < 10) {
            System.out.println("hello world");
            x++;
        }

        System.out.println("=================");

//        int ge = 0 ;
//        int shi = 0;
//        int bai = 0;
//        int count = 0;
//        for (int j = 100; j <= 999; j++){
//            ge = j % 10;
//            shi = j / 10 % 10;
//            bai = j /100;
//            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == j){
//                System.out.print("水仙花数:" + j + " ");
//                count++;
//                if (count % 2 == 0){
//                    System.out.println();
//                }
//            }
//        }
//        System.out.println("水仙花数共有:" + count);

        int ge;
        int shi;
        int bai;
        int count = 0;

        int j = 100;
        while (j <= 999){
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
            j++;
        }
        System.out.println("水仙花数共有:" + count);
    }
}
