package com.wanhe.homeworkday02;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        double one=2.25;
        double two =2.7;
        double three =3.25;
        double five =3.6;
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入存款年限：（1，2，3，5）");
        int x= sc.nextInt();
        System.out.println("请输入存款金额：");
        int money =sc.nextInt();
        double out=0 ;
        if(x==1){
            out=money*(1+one/100);
        }else if(x==2){
            out=money*(1+two/100*x);
        }else if(x==3){
            out=money*(1+three/100*x);
        }else if(x==5){
            out=money*(1+five/100*x);
        }
        System.out.println(out);
    }
}
