package com.wanhe.homeworkday06;

//1.	找出以下二维数组中的最小值：{16，7，12}，{9，20，18}，{14，11，5}，{8，5，10}，
// 然后输出相应的行号和列号。
public class Test1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{16,7,12},{9,20,18},{14,11,5},{8,5,10}};

        int min = arr[0][0];
        int hang = 0;
        int lie = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                    hang = i + 1;
                    lie = j + 1;
                }
            }
        }
        System.out.println("min="+min);
        System.out.println("行="+hang+" 列="+lie);
    }
}
