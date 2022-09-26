package com.wanhe.day06;

/*
二维数组遍历

打印三角形（行数可以键盘录入）
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

规律：
    A.任何一行的第一列和最后一列都是1
    B.从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和
 */

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        //二维数组遍历
        for (int i = 0; i < arr.length; i++){
            //System.out.println(arr[i]);//每一个下标对应的一维数组
            //遍历每一个一维数组arr[i]
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
