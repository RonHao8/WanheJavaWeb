package com.wanhe.homeworkday06;

//公司年销售额求和
//        某公司按照季度和月份统计的数据如下：单位(万元)
//            第一季度：22,66,44
//            第二季度：77,33,88
//            第三季度：25,45,65
//            第四季度：11,66,99
//
//       键盘录入每个月的销售额，按照季度去输入

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        sum();

    }

    public static void sum(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[][] arr = new int[4][3];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println("请输入第"+(i + 1)+"季度的第"+(j+1)+"月的销售额");
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }

        }
        System.out.println("公司年销售额求和:"+sum);

    }
}
