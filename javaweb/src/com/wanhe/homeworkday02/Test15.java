package com.wanhe.homeworkday02;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {


        int sui1=3;
        int sui2=10;
        int sui3=20;
        int sui4=25;
        int sui5 =30;
        int sui6=35;
        int sui7=45;
        Scanner sc =new Scanner(System.in);
        System.out.println("输入工资");
        int money =sc.nextInt();

        double jiao=0;
        double hou=money*0.9-5000;
        if (hou>0&&hou<3000){
            jiao=jiao+hou*sui1/100;
        }else if (hou>3000&&hou<12000){
            hou=hou-3000;
            jiao=jiao+hou*sui2/100+3000*sui1/100;
        }else if (hou>12000&&hou<25000){
            hou=hou-12000;
            jiao=jiao+hou*sui3/100+3000*sui1/100+12000*10/100;
        }else if (hou>25000&&hou<35000){
            hou=hou-25000;
            jiao=jiao+hou*sui4/100+3000*sui1/100+12000*10/100+25000*20/100;
        }else if (hou>35000&&hou<55000){
            hou=hou-35000;
            jiao=jiao+hou*sui5/100+3000*sui1/100+12000*10/100+25000*20/100+35000*25/100;
        }else if (hou>55000&&hou<80000){
            hou=hou-55000;
            jiao=jiao+hou*sui6/100+3000*sui1/100+12000*10/100+25000*20/100+35000*25/100+55000*30/100;
        }
        else if(hou>80000){
            hou =money*0.9-80000+3000*sui1/100+12000*10/100+25000*20/100+35000*25/100+55000*30/100+80000*35/100;
            jiao=jiao+hou*sui7/100;
        }
        System.out.println(jiao);

    }
}
