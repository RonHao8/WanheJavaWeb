package com.wanhe.homeworkday04;

import java.util.Scanner;

//3.键盘录入三个数据，返回三个数中的最大值
public class Test23 {
    public static void main(String[] args) {

        int max = getMax();
        System.out.println("max=" + max);
    }

    public static int getMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("请输入第三个数");
        int c = sc.nextInt();

        int max = 0;
        if (a > b){
            if (a > c){
                max = a;
            }else {
                max = c;
            }
        }else if (b > c){
            max = b;
        }else {
            max = c;
        }
        return max;
    }
}
