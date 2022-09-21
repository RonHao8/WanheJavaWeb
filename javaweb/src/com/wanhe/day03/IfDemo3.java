package com.wanhe.day03;

import java.util.Scanner;

/*
if(关系表达式1){
    语句体1;
}else if(关系表达式2){
    语句体2;
}else if(关系表达式3){
    语句体3;
}...
else{
    语句体n+1;
}
 */
public class IfDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的考试成绩");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100){
            if(score >= 90 && score <= 100){
                System.out.println("优秀");
            }else if (score >= 80 && score < 90){
                System.out.println("良好");
            }else if (score >= 70 && score < 80){
                System.out.println("中等");
            }else if (score >= 60 && score < 70){
                System.out.println("及格");
            }else {
                System.out.println("不及格");
            }
        }else {
            System.out.println("你输入的数据有误");
        }

//        if (score < 0 || score > 100){
//            System.out.println("你输入的数据有误");
//        }else if(score >= 90 && score <= 100){
//            System.out.println("优秀");
//        }else if (score >= 80 && score < 90){
//            System.out.println("良好");
//        }else if (score >= 70 && score < 80){
//            System.out.println("中等");
//        }else if (score >= 60 && score < 70){
//            System.out.println("及格");
//        }else {
//            System.out.println("不及格");
//        }


    }
}
