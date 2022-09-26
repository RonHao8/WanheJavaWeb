package com.wanhe.day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
1.幸运小游戏：
规则如下：
    游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家猜数字：
        未猜中提示：未命中，并继续猜
        猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的位置，且输出全部5个数，最终结束游戏

2.某公司开发部5名开发人员，要进行项目进展汇报演讲，现在才去随机排名后进行汇报
请先一次录入5名员工的工号，然后展示一组随机的排名顺序

3.将一组数组中的元素进行对调
如：int[] arr = {12,23,98} 对调后是 int[] arr = {98,23,12}

4.比较两组数组是否相同（内容和个数完全一样）

 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();

    }

    private static void test4() {
        int[] arr = new int[]{1,3,5,7};
        int[] brr = new int[]{1,3,5,9};

        //内容、个数完全一样
        if (arr==brr){
            System.out.println("两个数组相同");
        }else {
            //地址值不同，是两个数组
            if (arr.length != brr.length){
                System.out.println("两个数组不相同");
            }else {
                for (int i = 0; i < arr.length; i++){
                    if (arr[i] != brr[i]){
                        System.out.println("两个数组不相同");
                        return;
                    }
                }
                System.out.println("两个数组相同");
            }
        }

    }

    private static void test3() {
        int[] arr = {12,23,98};
        System.out.println("逆序前："+ Arrays.toString(arr));

//        for (int i = 0; i < arr.length / 2; i++){
//            int temp;
//            temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//
        for (int start = 0,end = arr.length-1;start<=end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        System.out.println("逆序后: "+Arrays.toString(arr));
//        System.out.print("逆序后：");
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
    }

    private static void test2() {
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

    private static void test1() {
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(20);
        }
        System.out.println("请输入你要猜的数");
        Scanner sc = new Scanner(System.in);

        int flag = 1;
        while (flag == 1) {
            int x = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                if (x == arr[i]) {
                    flag = 0;
                    System.out.println("运气不错，猜中了" + "\n" + "该数据第一次出现在第" + (i + 1) + "位");
                    for (int j = 0; j < 5; j++) {
                        System.out.print(arr[j] + " ");
                    }
                }
            }
            if (flag == 1) {
                System.out.println("未命中，并继续猜");
            }

        }
    }
}
