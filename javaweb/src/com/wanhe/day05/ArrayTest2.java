package com.wanhe.day05;

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
