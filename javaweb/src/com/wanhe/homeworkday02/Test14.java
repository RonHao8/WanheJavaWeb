package com.wanhe.homeworkday02;
import java.util.Scanner;
public class Test14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入顾客类别：（0表示普通顾客，1表示会员）");
        int x = sc.nextInt();
        System.out.println("输入购物的折前金额（整数）");
        int price = sc.nextInt();
        double out=0 ;
        if(x==0&&price<100){
            out =price;
        }else if(x==0&&price>=100){
            out = price*0.9;
        }else if(x==1&&price<200){
            out=price*0.8;
        }else if(x==1&&price>=200){
            out=price*0.75;
        }
        System.out.println(out);
    }
}
