package com.wanhe.day03;

/*
格式：
    if(关系表达式){
        语句体;
    }
*/
public class IfDemo {
    public static void main(String[] args) {
        int heraBeat = 65;
        if (heraBeat < 60 || heraBeat > 100){//60~100 正常范围
            //进一步检查
            System.out.println("您的心跳是：" + heraBeat + ",您可能需要进一步检查");
        }
        System.out.println("检查结束");


        System.out.println("=================");

        int x = 10;
        if (x == 10){
            System.out.println("x的值为10");
        }

        if ((x > 5) || (x == 10)){
            System.out.println("x大于或者等于10");
        }


        /*
        if 语句控制的语句体如果是一条语句，大括号可以省略；
        如果是多条语句，就不能省略，建议不要省略
        */
        int a = 101;
        if (a == 100) {
            System.out.println("a的值为100");
            System.out.println("over");
        }

        /*
        一般来说，if语句的小括号后面，不要写分号
         */
        int b = 100;
        if (b == 100){};//编译的时候会添加大括号，大括号内是空的语句体
        //独立的代码块
        {
            System.out.println("b的值是100");
            System.out.println("over");
        }

        System.out.println("====================");

        //if (a != 100)
            //int b1 = 10;//对于编译器来说，这算两条语句，定义变量和变量赋值


    }
}
