package com.wanhe.day05;

//2.某公司开发部5名开发人员，要进行项目进展汇报演讲，现在才去随机排名后进行汇报
//请先一次录入5名员工的工号，然后展示一组随机的排名顺序

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "位员工工号");
            arr[i] = sc.nextInt();
        }
        Random r = new Random();
        int[] arr1 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = r.nextInt(5);
            int temp = arr[arr1[i]];
            arr[arr1[i]] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
        }
    }
}
