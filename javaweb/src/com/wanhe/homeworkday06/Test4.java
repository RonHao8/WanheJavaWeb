package com.wanhe.homeworkday06;

import java.util.Scanner;

//已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引，并在控
//
//    制台输出找到的索引值。
public class Test4 {
    public static void main(String[] args) {
        find();

    }

    public static void find(){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{19, 28, 37, 46, 50};
        int index = -1;

        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (num == arr[i]){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该数在数组中不存在，索引为:"+index);
            return;
        }
        System.out.println(num + "在数组中的索引为:"+index);
    }
    
}
